public class Letter {

    String sender;
    String recipient;
    String body = "";

    public Letter(String sender, String recipient) {
        this.sender = sender;
        this.recipient = recipient;
    }
    public String getSender() {
        String capitalInitial = sender.substring(0,1).toUpperCase();
        return capitalInitial.concat(sender.substring(1));
    }

    public String getRecipient() {
        return recipient;
    }

    public void addLine(String line){
        this.body += line + "\n";

    }

    public String getText() {
        String greeting = "Dear "+ recipient +":" + "\n\n";
        String ending = "\n"+"Sincerely,"+ "\n" + sender;
        String context = greeting.concat(this.body).concat(ending);
        return context;
    }

    public static void main(String[] args) {
        Letter letter = new Letter("jose","Ayelen");
        String given = "Te quiero mucho";
        String secondLine = "Nos miramos pronto";
        letter.addLine(given);
        letter.addLine(secondLine);
        System.out.println(letter.getSender());

    }


}
