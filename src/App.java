public class App {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        System.out.print("qual dia cai? escolha entre 1 e 7 e veja qual dia da semana é hoje: ");
        int dia = Integer.parseInt(scanner.nextLine());
        String day = " ";

        switch (dia){
            case 1:
                System.out.println("hoje é domingo");
                break;
            case 2:
                System.out.println("hoje é segunda feira");;
                break;
            case 3:
                System.out.println("hoje é terça feira");;
                break;
            case 4:
                System.out.println("Hoje é quarta feira");;
                break;
            case 5:
                System.out.println("hoje é Quinta feira");;
                break;
            case 6:
                System.out.println("hoje é sexta feira");;
                break;
            case 7:
                System.out.println("hoje é sábado");;
                break;
            default:
                System.out.println("Dia inválido :(");
        }
    }
}
