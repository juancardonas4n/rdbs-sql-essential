public class SetMapperMap {

    private class Pair {
        Employee employee;
        List<Integer> listaJefes;
        // Employee's id.
        Par(Employee employee, int id) {
            this.employee = employee;
            this.listaJefes = new ArrayList<>();
            this.listaJefes.add(id);
        }

    public static void main(String ... args) {
        Map<Integer, Pair> map = ... ;
    }

}
