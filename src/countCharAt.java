public class countCharAt {

        public static void main(String[] args) {
            String name = "Edmund Quainoo AKA Tommy kusha";
            int count = 0;

            //Counts each character except space
            for(int i = 0; i < name.length(); i++) {
                if(name.charAt(i) != ' ') count++;
            }

            //Displays the total number of characters present in the given string
            System.out.println("Total number of characters in a string: " + name + " is " + count );


        }
    }


