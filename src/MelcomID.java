//import java.util.Scanner;
//public class MelcomID {
//    public static void main(String[] args) {
//
//
//        class StoreItem {
//            long itemNumber;
//            String category;
//            String itemName;
//            Boolean isClothingItem;
//            double unitPrice;
//
//
//             public void userInput() {
//                Scanner input = new Scanner(System.in);
//                Scanner syn = new Scanner(System.in);
//
//                System.out.print("Enter product item number: ");
//                itemNumber = input.nextLong();
//
//                System.out.print("Enter item category: ");
//                category = syn.nextLine();
//
//                System.out.print("Enter item name: ");
//                itemName = syn.nextLine();
//
//                System.out.print("Is the item a clothing item. Enter true of false: ");
//                isClothingItem = syn.nextBoolean();
//
//                System.out.print("Enter unit price for the item: ");
//                unitPrice = syn.nextDouble();
//
//                switch (category) {
//                    case "Women":
//                        System.out.println("You selected WOMEN category");
//                        category = "WOMEN";
//                        break;
//
//                    case "Men":
//                        System.out.println("You selected MEN category");
//                        category = "MEN";
//                        break;
//
//                    case "Girls":
//                        System.out.println("You selected GIRLS category");
//                        category = "GIRLS";
//                        break;
//
//                    case "Boys":
//                        System.out.println("You selected BOYS category");
//                        category = "BOYS";
//                        break;
//
//                    case "Babies":
//                        System.out.println("You selected BABIES category");
//                        category = "BABIES";
//                        break;
//
//                    default:
//                        System.out.println("Category not found. Enter anyone of the following: 'Women', 'Men', 'Girls', 'Boys', or 'Babies'.");
//                        break;
//                }
//
//            }
//
//
//            void display() {
//                System.out.println("Department Store");
//                System.out.println("============================================");
//                System.out.println("Stock:\t\t\t\t " + this.itemNumber);
//                System.out.println("Clothing item:\t\t\t " + this.isClothingItem);
//                System.out.println("Category:\t\t\t " + this.category);
//                System.out.println("Name:\t\t\t\t " + this.itemName);
//                System.out.printf("Unit Price:\t\t\t GHs  ", this.unitPrice);
//            }
//
//            public static void main(String[] args) {
//                MelcomID myObj = new MelcomID();
//                myObj.userInput();
//                myObj.display();
//            }
//
//        }
//    }
//
//    private void display() {
//
//    }
//
//    private void userInput() {
//    }
//}