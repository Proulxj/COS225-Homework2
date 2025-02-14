public class Grove {
    Tree[] trees = new Tree[16];
    String grove_name;

    Grove(String grove_name) { 
        this.grove_name = grove_name;
    }

    int Plant_Tree(Tree param_tree) {
       /*  for (Tree tree : trees) {
            if (tree == null) {
                //tree.age = param_tree.age;
                //tree.id_number = param_tree.id_number;
                //tree.species_name = param_tree.species_name;
                //return 0;

            }
        }*/

        for (int i = 0; i < trees.length; i++){
            if (trees[i] == null){
                trees[i] = param_tree;
                return i;
            }
        }
        return -1;

    }

    Tree Remove_Tree(int index) {
        Tree removable_tree = trees[index];
        trees[index] = null;
        return removable_tree;
    }

    @Override
    public String toString() {
        int number_of_trees = 0;
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] != null) {
                number_of_trees++;
            }
        }

        return Integer.toString(number_of_trees);
    }

}
