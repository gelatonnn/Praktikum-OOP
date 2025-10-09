public class EducationalBot extends Chatbot {
    public EducationalBot(String name) {
        super(name);
    }

    @Override
    public void respond() {
        System.out.println("Educational bot " + name + " siap membantu belajar Anda");
    }

    @Override
    public void displayInfo() {
        System.out.println("Educational Bot " + name + " telah melayani " + sessionCount + " sesi");
    }

    public void teachTopic(String topic) {
        System.out.println("Mengajarkan topik: " + topic);
    }

    @Override
    public String getBotType() {
        return "Educational Bot";
    }
}