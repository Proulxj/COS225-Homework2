public class Grove_Tester {


    public static void main(String[] args) {
        Grove grove_1 = new Grove("Grove 1");

        System.out.println(grove_1);

        Tree tree = new Tree(1, 37, "Spruce");
        
        for(int i = 0; i < 6; i++){
            grove_1.Plant_Tree(tree);
        }
        System.out.println(grove_1);

        grove_1.Remove_Tree(3);
        grove_1.Remove_Tree(5);
        
        System.out.println(grove_1);

        tree.id_number = 2;
        tree.age = 13;
        tree.species_name = "Maple";

        grove_1.Plant_Tree(tree);

        System.out.println(grove_1);


    }
}
