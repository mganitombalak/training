package aero.tav;

import java.util.List;
import java.util.stream.Collectors;

public class EntityManager<T extends IEntity<Integer>> {

    private List<T> dataSet;

    public EntityManager(List<T> data) {
        this.dataSet = data;
    }

    public List<T> findAll(){
        return dataSet;
    }

    public List<T> findById(int id) {
        return this.dataSet.stream()
                .filter(entity->entity.getId()==id)
                .collect(Collectors.toList());
    }

    public List<T> findByKeyword(String keyword){
        return this.dataSet.stream()
                .filter(entity->entity.toString()
                .contains(keyword)).collect(Collectors.toList());
    }
}
