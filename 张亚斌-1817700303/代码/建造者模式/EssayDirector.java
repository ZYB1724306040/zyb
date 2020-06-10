public class EssayDirector {
    public ChickenSoup getFinalEssay(EssayBuilder eb) {
        eb.setEssayObject();
        eb.setEssayPredicate();
        eb.setEssaySubject();
        return eb.getEssay();
    }
}