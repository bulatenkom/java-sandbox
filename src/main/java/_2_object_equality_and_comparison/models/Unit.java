package _2_object_equality_and_comparison.models;

import lombok.Data;

@Data
public class Unit implements Comparable<Unit> {
    private static Long idCounter = 0L;
    private Long id;

    public Unit() {
        id = Unit.idCounter++;
    }

    private ISpeak iSpeak = phrase -> System.out.println("phrase = " + phrase);

    public void print() {
        System.out.println("Unit's id = " + id);
        iSpeak.speak(id.toString());
    }

    @Override
    public int compareTo(Unit unit) {
        return this.id == unit.getId() ? 0 : (this.id > unit.getId()) ? 1 : -1;
    }
}
