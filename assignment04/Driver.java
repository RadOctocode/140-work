package assignment04;
import java.util.ArrayList;


public class Driver{

public static void main(String [] args){


VariousMethods tester= new VariousMethods();
long[] test1={1,5,6,4,6,6,7,8,9};
long[] test2=null;
long[] test3={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
long[] test4=new long[1];
long[] test5=new long[0];
System.out.println("----------------------------------------------");
System.out.println("expect 3: "+tester.oddEvenCount(test1)); //expect 3
System.out.println("expect -1: "+tester.oddEvenCount(test2)); //expect-1
System.out.println("expect 8: "+tester.oddEvenCount(test3)); //expect 8
System.out.println("expect 0: "+tester.oddEvenCount(test4)); //expect 8
System.out.println("expect 0: "+tester.oddEvenCount(test5)); //expect 8

System.out.println("----------------------------------------------");
ArrayList<BankAccount> testBank=new ArrayList<>();
ArrayList<BankAccount> emptyBank=new ArrayList<>();
ArrayList<BankAccount> nullBank=null;
ArrayList<BankAccount> testBank2=new ArrayList<>();
ArrayList<BankAccount> testBank3=new ArrayList<>();
ArrayList<BankAccount> testBank4=new ArrayList<>();
ArrayList<BankAccount> testBank5=new ArrayList<>();
ArrayList<BankAccount> testBank6=new ArrayList<>();
for (int i=0; i<11;i++){
	testBank.add(new BankAccount(i+100));
}//end of for loop

for (int i=0; i<11;i++){
	testBank2.add(new BankAccount(i+100));
	testBank2.add(null);
}//end of for loop

for (int i=0; i<100;i++){
	testBank3.add(new BankAccount(i+100));
}//end of for loop

for (int i=0; i<90;i++){
	testBank4.add(new BankAccount(i+110));
}//end of for loop

for (int i=0; i<29;i++){
	testBank5.add(new BankAccount(i));
}//end of for loop



testBank.add(new BankAccount(20));
testBank5.add(new BankAccount(27));
testBank6.add(new BankAccount(10));


System.out.println("expect 10: "+tester.minCount(100.0, testBank));//expect 10
System.out.println("expect 10: "+tester.minCount(100.0, testBank2));//expect 10
System.out.println("expect 99: "+tester.minCount(100.0, testBank3));//expect 10
System.out.println("expect -1: "+tester.minCount(100.0, emptyBank));//expect -1
System.out.println("expect -1: "+tester.minCount(100.0, nullBank));//expect -1
System.out.println("----------------------------------------------");
String[] names={/**start 1**/"Mary", "Patricia", "Linda",
		"Barbara", "Elizabeth", "Jennifer", "Maria", "Susan",
		"Margarett", "Dorothy",/**start 2**/ "Lisa", "Nancy",/**end 1**/ "Karen",
		"Betty", "Helen", "Sandra", "Donna", "Carol", "Ruth",
		"Sharon", "Michelle",/**end 2**/ "Laura", "Sarah", "Kimberly",
		"Deborah", "Jessica", "Shirley", "Cynthia", "Angela",
		"Melissa", "Brenda", /**start 3**/"Amy", "Anna", "Rebecca",
		"Virginia", "Kathleen", "Pamela", "Martha", "Debra",
		"Amanda", "Stephanie", "Carolyn", "Christine", "Marie",
		"Janet", "Catherine", "Frances", "Ann", "Joyce", "Diane",
		"Alice", "Julie", "Heather", "Teresa", "Doris", "Gloria",
		"Evelyn", "Jean", "Cheryl", "Mildred", "Katherine",
		"Joan", "Ashley", "Judith", "Rose", "Janice", "Kelly",
		"Nicole", "Judy", "Christina", "Kathy", "Theresa",
		"Beverly", "Denise", "Tammy", "Irene", "Jane", "Lori",
		"Rachel", "Marilyn", "Andrea", "Kathryn", "Louise",
		"Sara", "Anne", "Jacqueline", "Wanda", "Bonnie", "Julia",
		"Ruby", "Lois", "Tina", "Phyllis", "Norma", "Paula",
		"Diana", "Annie", "Lillian", "Emily", "Robin", "Peggy",
		"Crystal", "Gladys", "Rita", "Dawn", "Connie", "Florence",
		"Tracy", "Edna", "Tiffany", "Carmen", "Rosa", "Cindy",
		"Grace", "Wendy", "Victoria", "Edith", "Kim", "Sherry",
		"Sylvia", "Josephine", "Thelma", "Shannon", "Sheila",
		"Ethel", "Ellen", "Elaine", "Marjorie", "Carrie",
		"Charlotte", "Monica", "Esther", "Pauline", "Emma",
		"Juanita", "Anita", "Rhonda", "Hazel", "Amber", "Eva",
		"Debbie", "April", "Leslie", "Clara", "Lucille", "Jamie",
		"Joanne", "Eleanor", "Valerie", "Danielle", "Megan",
		"Alicia", "Suzanne", "Michele", "Gail", "Bertha",
		"Darlene", "Veronica", "Jill", "Erin", "Geraldine",
		"Lauren", "Cathy", "Joann", "Lorraine", "Lynn", "Sally",
		"Regina", "Erica", "Beatrice", "Dolores", "Bernice",
		"Audrey", "Yvonne", "Annette", "June", "Samantha",
		"Marion", "Dana", "Stacy", "Ana", "Renee", "Ida",
		"Vivian", "Roberta", "Holly", "Brittany", "Melanie",
		"Loretta", "Yolanda", "Jeanette", "Laurie", "Katie",
		"Kristen", "Vanessa", "Alma", "Sue", "Elsie", "Beth",
		"Jeanne", "Vicki", "Carla", "Tara", "Rosemary", "Eileen",
		"Terri", "Gertrude", "Lucy", "Tonya", "Ella", "Stacey",
		"Wilma", "Gina", "Kristin", "Jessie", "Natalie", "Agnes",
		"Vera", "Willie", "Charlene", "Bessie", "Delores",
		"Melinda", "Pearl", "Arlene", "Maureen", "Colleen",
		"Allison", "Tamara", "Joy", "Georgia", "Constance",
		"Lillie", "Claudia", "Jackie", "Marcia", "Tanya",
		"Nellie", "Minnie", "Marlene", "Heidi", "Glenda",
		"Lydia", "Viola", "Courtney", "Marian", "Stella",
		"Caroline", "Dora", "Jo", "Vickie", "Mattie", "Terry",
		"Maxine", "Irma", "Mabel", "Marsha", "Myrtle", "Lena",
		"Christy", "Deanna", "Patsy", "Hilda", "Gwendolyn",
		"Jennie", "Nora", "Margie", "Nina", "Cassandra", "Leah",
		"Penny", "Kay", "Priscilla", "Naomi", "Carole", "Brandy",
		"Olga", "Billie", "Dianne", "Tracey", "Leona", "Jenny",
		"Felicia", "Sonia", "Miriam", "Velma", "Becky", "Bobbie",
		"Violet", "Kristina", "Toni", "Misty", "Mae", "Shelly",
		"Daisy", "Ramona", "Sherri", "Erika", "Katrina", "Claire",
		"Lindsey", "Lindsay", "Geneva", "Guadalupe", "Belinda",
		"Margarita", "Sheryl", "Cora", "Faye", "Ada", "Natasha",
		"Sabrina", "Isabel", "Marguerite", "Hattie", "Harriet",
		"Molly", "Cecilia", "Kristi", "Brandi", "Blanche",
		"Sandy", "Rosie", "Joanna", "Iris", "Eunice", "Angie",
		"Inez", "Lynda", "Madeline", "Amelia", "Alberta",
		"Genevieve", "Monique", "Jodi", "Janie", "Maggie",
		"Kayla", "Sonya", "Jan", "Lee", "Kristine", "Candace",
		"Fannie", "Maryann", "Opal", "Alison", "Yvette", "Melody",
		"Luz", "Susie", "Olivia", "Flora", "Shelley", "Kristy",
		"Mamie", "Lula", "Lola", "Verna", "Beulah", "Antoinette",
		"Candice", "Juana", "Jeannette", "Pam", "Kelli", "Hannah",
		"Whitney", "Bridget", "Karla", "Celia", "Latoya", "Patty",
		"Shelia", "Gayle", "Della", "Vicky", "Lynne", "Sheri",
		"Marianne", "Kara", "Jacquelyn", "Erma", "Blanca", "Myra",
		"Leticia", "Pat", "Krista", "Roxanne", "Angelica",
		"Johnnie", "Robyn", "Francis", "Adrienne", "Rosalie",
		"Alexandra", "Brooke", "Bethany", "Sadie", "Bernadette",
		"Traci", "Jody", "Kendra", "Jasmine", "Nichole",
		"Rachael", "Chelsea", "Mable", "Ernestine", "Muriel",
		"Marcella", "Elena", "Krystal", "Angelina", "Nadine",
		"Kari", "Estelle", "Dianna", "Paulette", "Lora", "Mona",
		"Doreen", "Rosemarie", "Angel", "Desiree", "Antonia",
		"Hope", "Ginger", "Janis", "Betsy", "Christie", "Freda",
		"Mercedes", "Meredith", "Lynette", "Teri", "Cristina",
		"Eula", "Leigh", "Meghan", "Sophia", "Eloise", "Rochelle",
		"Gretchen", "Cecelia", "Raquel", "Henrietta", "Alyssa",
		"Jana", "Kelley", "Gwen", "Kerry", "Jenna", "Tricia",
		"Laverne", "Olive", "Alexis", "Tasha", "Silvia", "Elvira",
		"Casey", "Delia", "Sophie", "Kate", "Patti", "Lorena",
		"Kellie", "Sonja", "Lila", "Lana", "Darla", "May",
		"Mindy", "Essie", "Mandy", "Lorene", "Elsa", "Josefina",
		"Jeannie", "Miranda", "Dixie", "Lucia", "Marta", "Faith",
		"Lela", "Johanna", "Shari", "Camille", "Tami", "Shawna",
		"Elisa", "Ebony", "Melba", "Ora", "Nettie", "Tabitha",
		"Ollie", "Jaime", "Winifred", "Kristie", "Marina",
		"Alisha", "Aimee", "Rena", "Myrna", "Marla", "Tammie",
		"Latasha", "Bonita", "Patrice", "Ronda", "Sherrie",
		"Addie", "Francine", "Deloris", "Stacie", "Adriana",
		"Cheri", "Shelby", "Abigail", "Celeste", "Jewel", "Cara",
		"Adele", "Rebekah", "Lucinda", "Dorthy", "Chris", "Effie",
		"Trina", "Reba", "Shawn", "Sallie", "Aurora", "Lenora",
		"Etta", "Lottie", "Kerri", "Trisha", "Nikki", "Estella",
		"Francisca", "Josie", "Tracie", "Marissa", "Karin",
		"Brittney", "Janelle", "Lourdes", "Laurel", "Helene",
		"Fern", "Elva", "Corinne", "Kelsey", "Ina", "Bettie",
		"Elisabeth", "Aida", "Caitlin", "Ingrid", "Iva",
		"Eugenia", "Christa", "Goldie", "Cassie", "Maude",
		"Jenifer", "Therese", "Frankie", "Dena", "Lorna",
		"Janette", "Latonya", "Candy", "Morgan", "Consuelo",
		"Tamika", "Rosetta", "Debora", "Cherie", "Polly", "Dina",
		"Jewell", "Fay", "Jillian", "Dorothea", "Nell", "Trudy",
		"Esperanza", "Patrica", "Kimberley", "Shanna", "Helena",
		"Carolina", "Cleo", "Stefanie", "Rosario", "Ola",
		"Janine", "Mollie", "Lupe", "Alisa", "Lou", "Maribel",
		"Susanne", "Bette", "Susana", "Elise", "Cecile",
		"Isabelle", "Lesley", "Jocelyn", "Paige", "Joni",
		"Rachelle", "Leola", "Daphne", "Alta", "Ester", "Petra",
		"Graciela", "Imogene", "Jolene", "Keisha", "Lacey",
		"Glenna", "Gabriela", "Keri", "Ursula", "Lizzie",
		"Kirsten", "Shana", "Adeline", "Mayra", "Jayne",
		"Jaclyn", "Gracie", "Sondra", "Carmela", "Marisa",
		"Rosalind", "Charity", "Tonia", "Beatriz", "Marisol",
		"Clarice", "Jeanine", "Sheena", "Angeline", "Frieda",
		"Lily", "Robbie", "Shauna", "Millie", "Claudette",
		"Cathleen", "Angelia", "Gabrielle", "Autumn", "Katharine",
		"Summer", "Jodie", "Staci", "Lea", "Christi", "Jimmie",
		"Justine", "Elma", "Luella", "Margret", "Dominique",
		"Socorro", "Rene", "Martina", "Margo", "Mavis", "Callie",
		"Bobbi", "Maritza", "Lucile", "Leanne", "Jeannine",
		"Deana", "Aileen", "Lorie", "Ladonna", "Willa", "Manuela",
		"Gale", "Selma", "Dolly", "Sybil", "Abby", "Lara", "Dale",
		"Ivy", "Dee", "Winnie", "Marcy", "Luisa", "Jeri",
		"Magdalena", "Ofelia", "Meagan", "Audra", "Matilda",
		"Leila", "Cornelia", "Bianca", "Simone", "Bettye",
		"Randi", "Virgie", "Latisha", "Barbra", "Georgina",			
		"Eliza", "Leann", "Bridgette", "Rhoda", "Haley", "Adela",
		"Nola", "Bernadine", "Flossie", "Ila", "Greta", "Ruthie",
		"Nelda", "Minerva", "Lilly", "Terrie", "Letha", "Hilary",
		"Estela", "Valarie", "Brianna", "Rosalyn", "Earline",
		"Catalina", "Ava", "Mia", "Clarissa", "Lidia", "Corrine",
		"Alexandria", "Concepcion", "Tia", "Sharron", "Rae",
		"Dona", "Ericka", "Jami", "Elnora", "Chandra", "Lenore",
		"Neva", "Marylou", "Melisa", "Tabatha", "Serena", "Avis",
		"Allie", "Sofia", "Jeanie", "Odessa", "Nannie",
		"Harriett", "Loraine", "Penelope", "Milagros", "Emilia",
		"Benita", "Allyson", "Ashlee", "Tania", "Tommie",
		"Esmeralda", "Karina", "Eve", "Pearlie", "Zelma",
		"Malinda", "Noreen", "Tameka", "Saundra", "Hillary",
		"Amie", "Althea", "Rosalinda", "Jordan", "Lilia",
		"Alana", "Gay", "Clare", "Alejandra", "Elinor", "Michael",
		"Lorrie", "Jerri", "Darcy", "Earnestine", "Carmella",
		"Taylor", "Noemi", "Marcie", "Liza", "Annabelle",
		"Louisa", "Earlene", "Mallory", "Carlene", "Nita",
		"Selena", "Tanisha", "Katy", "Julianne", "John",
		"Lakisha", "Edwina", "Maricela", "Margery", "Kenya",
		"Dollie", "Roxie", "Roslyn", "Kathrine", "Nanette",
		"Charmaine", "Lavonne", "Ilene", "Kris", "Tammi",
		"Suzette", "Corine", "Kaye", "Jerry", "Merle", "Chrystal",
		"Lina", "Deanne", "Lilian", "Juliana", "Aline", "Luann",
		"Kasey", "Maryanne", "Evangeline", "Colette", "Melva",
		"Lawanda", "Yesenia", "Nadia", "Madge", "Kathie", "Eddie",
		"Ophelia", "Valeria", "Nona", "Mitzi", "Mari",
		"Georgette", "Claudine", "Fran", "Alissa", "Roseann",
		"Lakeisha", "Susanna", "Reva", "Deidre", "Chasity",
		"Sheree", "Carly", "James", "Elvia", "Alyce", "Deirdre",
		"Gena", "Briana", "Araceli", "Katelyn", "Rosanne",
		"Wendi", "Tessa", "Berta", "Marva", "Imelda", "Marietta",
		"Marci", "Leonor", "Arline", "Sasha", "Madelyn", "Janna",
		"Juliette", "Deena", "Aurelia", "Josefa", "Augusta",
		"Liliana", "Young", "Christian", "Lessie", "Amalia",
		"Savannah", "Anastasia", "Vilma", "Natalia", "Rosella",
		"Lynnette", "Corina", "Alfreda", "Leanna", "Carey",
		"Amparo", "Coleen", "Tamra", "Aisha", "Wilda", "Karyn",
		"Cherry", "Queen", "Maura", "Mai", "Evangelina",
		"Rosanna", "Hallie", "Erna", "Enid", "Mariana", "Lacy",
		"Juliet", "Jacklyn", "Freida", "Madeleine", "Mara",
		"Hester", "Cathryn", "Lelia", "Casandra", "Bridgett",
		"Angelita", "Jannie", "Dionne", "Annmarie", "Katina",
		"Beryl", "Phoebe", "Millicent", "Katheryn", "Diann",
		"Carissa", "Maryellen", "Liz", "Lauri", "Helga", "Gilda",
		"Adrian", "Rhea", "Marquita", "Hollie", "Tisha", "Tamera",
		"Angelique", "Francesca", "Britney", "Kaitlin", "Lolita",
		"Florine", "Rowena", "Reyna", "Twila", "Fanny", "Janell",
		"Ines", "Concetta", "Bertie", "Alba", "Brigitte",
		"Alyson", "Vonda", "Pansy", "Elba", "Noelle", "Letitia",
		"Kitty", "Deann", "Brandie", "Louella", "Leta", "Felecia",
		"Sharlene", "Lesa", "Beverley", "Robert", "Isabella",
		"Herminia", "Terra", "Celina"};
		//names from resources file in assignment03

for (int x=0; x<testBank.size();x++){
String currentName=names[x];
Person currentPerson= new Person(currentName,3,2,2001);
BankAccount currentBankAccount=testBank.get(x);
currentBankAccount.setCustomer(currentPerson);
}//loop through array list

for (int j=0; j<testBank2.size();j++){
if(testBank2.get(j)!=null){
String currentName=names[j+10];
Person currentPerson= new Person(currentName,3,2,2001);
BankAccount currentBankAccount=testBank2.get(j);
currentBankAccount.setCustomer(currentPerson);
}
}//loop through array list

for (int f=0; f<testBank3.size();f++){
if(testBank3.get(f)!=null){
String currentName=names[f+30];
Person currentPerson= new Person(currentName,3,2,2001);
BankAccount currentBankAccount=testBank3.get(f);
currentBankAccount.setCustomer(currentPerson);
}
}//loop through array list

for (int f=0; f<testBank4.size();f++){
if(testBank4.get(f)!=null){
String currentName=names[f];
Person currentPerson= new Person(currentName,3,2,2001);
BankAccount currentBankAccount=testBank4.get(f);
currentBankAccount.setCustomer(currentPerson);
}
}//loop through array list

for (int f=0; f<testBank5.size();f++){
if(testBank5.get(f)!=null){
String currentName=names[f];
Person currentPerson= new Person(currentName,3,2,2001);
BankAccount currentBankAccount=testBank5.get(f);
currentBankAccount.setCustomer(currentPerson);
}
}//loop through array list

for (int f=0; f<testBank6.size();f++){
if(testBank6.get(f)!=null){
String currentName=names[f+100];
Person currentPerson= new Person(currentName,3,2,2001);
BankAccount currentBankAccount=testBank6.get(f);
currentBankAccount.setCustomer(currentPerson);
}
}//loop through array list

System.out.println("tie situation expect 8: "+tester.anotherExercise(testBank)); //expect 9
System.out.println("mixed with nulls expect 10: "+tester.anotherExercise(testBank2)); //expect 9
System.out.println("expect 55: "+tester.anotherExercise(testBank3)); //expect 9
System.out.println("expect -1: "+tester.anotherExercise(emptyBank)); //expect -1
System.out.println("expect -1: "+tester.anotherExercise(nullBank)); //expect -1
System.out.println("----------------------------------------------");
BankAccount[] arrayOfAccounts= testBank.toArray(new BankAccount[testBank.size()]);
BankAccount[] arrayOfAccounts2= testBank2.toArray(new BankAccount[testBank2.size()]);
BankAccount[] arrayOfAccounts3= testBank3.toArray(new BankAccount[testBank3.size()]);
BankAccount[] arraynull=null;
BankAccount[] arrayOfnull={null,null,null,null};
BankAccount[] emptyArray=new BankAccount[12];
BankAccount[] arrayOfAccounts4= testBank4.toArray(new BankAccount[testBank4.size()]);
BankAccount[] arrayOfAccounts5= testBank5.toArray(new BankAccount[testBank5.size()]);
BankAccount[] arrayOfAccounts6= testBank6.toArray(new BankAccount[testBank6.size()]);


System.out.println("3k+1 expect 107.0: "+tester.justAnExercise(100.0,'A',arrayOfAccounts));
System.out.println("3k+2 expect 110.0: "+tester.justAnExercise(103.0,'B',arrayOfAccounts2)); //expect random number
System.out.println("3k+1 expect 197.0: "+tester.justAnExercise(150.0,'J',arrayOfAccounts3)); //expect random number
System.out.println("3k+1 expect 195.0:"+tester.justAnExercise(100.0,'z',arrayOfAccounts4)); //-1.0
System.out.println("3k expect 27.0: "+tester.justAnExercise(100.0,'z',arrayOfAccounts5)); //-1.0
System.out.println("3k expect 25.0: "+tester.justAnExercise(27.0,'z',arrayOfAccounts5)); //-1.0
System.out.println("3k expect 25.0: "+tester.justAnExercise(25.0,'z',arrayOfAccounts5)); //-1.0
System.out.println("3k expect -1: "+tester.justAnExercise(10.0,'z',arrayOfAccounts6)); //-1.0
System.out.println("null test1 "+tester.justAnExercise(100.0,'A',arraynull)); //-1.0
System.out.println("null test2 "+tester.justAnExercise(100.0,'A',arrayOfnull)); //-1.0
System.out.println("empty test "+tester.justAnExercise(100.0,'A',emptyArray)); //-1.0
System.out.println("----------------------------------------------");

}//end of main




}//end of testdriver