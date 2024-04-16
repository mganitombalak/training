package main

import (
	"bufio"
	"context"
	"fmt"
	"github.com/ClickHouse/clickhouse-go/v2"
	"github.com/ClickHouse/clickhouse-go/v2/lib/driver"
	"log"
	"os"
)

//type report struct {
//	passengerCount uint8
//	avgTotalAmount float64
//}

type PickupToDropoff struct {
	PickupLocation  *string
	DropoffLocation *string
}

type Locations []PickupToDropoff

func main() {

	dbConnection, err := connectClickHouse()
	if err != nil {
		fmt.Println(err.Error())
	}

	ctx := context.Background()
	//rows, rowErr := dbConnection.Query(ctx, "SELECT passenger_count,ceil(avg(total_amount),2) AS average_total_amount FROM trips GROUP BY passenger_count")
	rows, rowErr := dbConnection.Query(ctx, "SELECT  pickup_ntaname,dropoff_ntaname FROM trips2")
	if rowErr != nil {
		log.Fatal(rowErr)
	}

	var locations Locations

	for rows.Next() {
		var location PickupToDropoff
		readErr := rows.Scan(&location.PickupLocation, &location.DropoffLocation)
		if readErr != nil {
			fmt.Println(readErr.Error())
		}
		locations = append(locations, location)
	}

	fmt.Printf("DB den okudum bitti.Devam etmek icin bir tusa bas... toplam: (%d)\n", len(locations))

	var read = bufio.NewScanner(os.Stdin).Scan()

	fmt.Printf("got: %s", read)

	for _, location := range locations {
		fmt.Printf("FROM `%s` TO `%s`\n", *location.PickupLocation, *location.DropoffLocation)
	}
	//var reports []report
	//for rows.Next() {
	//	var record report
	//	readErr := rows.Scan(&record.passengerCount, &record.avgTotalAmount)
	//	if readErr != nil {
	//		fmt.Println(readErr.Error())
	//	}
	//	reports = append(reports, record)
	//}
	//for _, rec := range reports {
	//	fmt.Printf("%d => %f\n", rec.passengerCount, rec.avgTotalAmount)
	//}
}

func connectClickHouse() (driver.Conn, error) {
	var (
		ctx       = context.Background()
		conn, err = clickhouse.Open(&clickhouse.Options{
			Addr: []string{"localhost:9000"},
			Auth: clickhouse.Auth{
				Database: "taxiDb",
				Username: "admin",
				Password: "password",
			},
			ClientInfo: clickhouse.ClientInfo{
				Products: []struct {
					Name    string
					Version string
				}{
					{Name: "tfkb", Version: "0.1"},
				},
			},

			Debugf: func(format string, v ...interface{}) {
				fmt.Printf(format, v)
			},
		})
	)

	if err != nil {
		return nil, err
	}

	if err := conn.Ping(ctx); err != nil {
		if exception, ok := err.(*clickhouse.Exception); ok {
			fmt.Printf("Exception [%d] %s \n%s\n", exception.Code, exception.Message, exception.StackTrace)
		}
		return nil, err
	}
	return conn, nil
}
