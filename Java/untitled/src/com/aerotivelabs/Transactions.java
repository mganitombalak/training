package com.aerotivelabs;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class Transactions {

    public static List<String> findRejectedTransactions(List<String> transactions, int creditLimit) {
        List<String> rejectedTransactions = Collections.synchronizedList(new ArrayList<>());
        List<StringTokenizer> validated = transactions.parallelStream().map(l -> {
            StringTokenizer tokenizer = new StringTokenizer(l, ",");
            return tokenizer.countTokens() == 5 ? tokenizer : null;
        }).collect(Collectors.toList());

        Map<String, List<String>> simplfied = validated.parallelStream()
                .collect(groupingBy((StringTokenizer r) -> r.nextToken() + r.nextToken() + r.nextToken(), mapping(r -> {
                    StringTokenizer t = r;
                    return t.nextToken() + "," + t.nextToken();
                }, toList())));

        List<StringTokenizer> withTotals = simplfied.entrySet().stream().map(r -> {
            List<String> values = r.getValue();
            Optional<Integer> total = values.stream().map(v -> {
                StringTokenizer t = new StringTokenizer(v, ",");
                return Integer.parseInt(t.nextToken());
            }).reduce((a, b) -> a + b);
            String tempData = r.getKey() + "," + total.get() + "," + values.get(values.size() - 1).split(",")[1].toString();
            return new StringTokenizer(tempData, ",");
        }).collect(toList());


        withTotals.parallelStream().forEach(tokenizer -> {
            boolean isValid = false;
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                if (token == null || token.length() <= 0) {
                    rejectedTransactions.add(token);
                    break;
                }
                token = tokenizer.nextToken();
                try {
                    int creditAmount = Integer.parseInt(token);
                    isValid = creditAmount > creditLimit;
                } catch (Exception e) {
                    rejectedTransactions.add(token);
                }
                token = tokenizer.nextToken();
                if (isValid) {
                    rejectedTransactions.add(token);
                }
            }
        });
        return rejectedTransactions;
    }
}
