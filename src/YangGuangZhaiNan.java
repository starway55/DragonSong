import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class YangGuangZhaiNan extends Song{

    public List<Paragraph> paragraphs;

    public YangGuangZhaiNan(){

        super.speed = 40.0f;

//        Paragraph p1 = new Paragraph();
//
//        Sentence p1s1 = new Sentence();
//        p1s1.addText("[-5.2][5.2][5.2][5.2][5.2][5.4][5.2][4.2][4.4][4.2][3.2][3.2][3.4]");
//        Sentence p1s2 = new Sentence();
//        p1s2.addText("[5.2][5.2][5.2][5.2][5.2][5.4][5.2][4.2][4.4][4.2][3.2][3.2][3.4][2.2][2.2][3.2]");
//        Sentence p1s3 = new Sentence();
//        p1s3.addText("[3.4][5.2][5.4][1.7][3.4][5.2][5.4][1.7]");
//        Sentence p1s4 = new Sentence();
//        p1s4.addText("[3.2][2.2][3.2][2.2][3.2][2.2][3.2][2.2][3.2][2.2][3.2][2.2][3.2][2.2][1.2]");
//
//        p1.addSentence(p1s1);
//        p1.addSentence(p1s2);
//        p1.addSentence(p1s3);
//        p1.addSentence(p1s4);
//
//        Paragraph p2 = new Paragraph();
//        Sentence p2s1 = new Sentence();
//        p2s1.addText("[5.2][5.2][5.2][5.2][5.2][5.4][5.2][4.2][4.4][4.2][3.2][3.2][3.4]");
//        Sentence p2s2 = new Sentence();
//        p2s2.addText("[5.2][5.2][5.2][5.2][5.2][5.4][5.2][4.2][4.2][4.2][4.2][3.2][3.2][3.4][2.2][2.2][3.2]");
//        Sentence p2s3 = new Sentence();
//        p2s3.addText("[3.4][5.2][5.4][1.7][3.4][5.2][5.4][1.7]");
//        Sentence p2s4 = new Sentence();
//        p2s4.addText("[3.2][2.2][3.2][2.2][3.2][2.2][3.2][2.2][3.2][2.2][3.2][2.2][3.2][2.2][1.4]");
//
//        p2.addSentence(p2s1);
//        p2.addSentence(p2s2);
//        p2.addSentence(p2s3);
//        p2.addSentence(p2s4);

        Paragraph p3 = new Paragraph();
        Sentence p3s1 = new Sentence();
        p3s1.addText("[6.6][7.4][+1.7][7.6][5.4][3.6][2.4][3.2][1.16]");
        Sentence p3s2 = new Sentence();
        p3s2.addText("[-5.2][5.3][4.3][3.2][2.4][3.2][1.16]");
        Sentence p3s3 = new Sentence();
        p3s3.addText("[5.2][5.2][4.2][3.2][3.4][2.12][6.2][5.8]");

        p3.addSentence(p3s1);
        p3.addSentence(p3s2);
        p3.addSentence(p3s3);


//        super.addParagraph(p1);
//        super.addParagraph(p2);
        super.addParagraph(p3);


    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Paragraph> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Paragraph paragraph) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Paragraph> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Paragraph> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Paragraph get(int index) {
        return null;
    }

    @Override
    public Paragraph set(int index, Paragraph element) {
        return null;
    }

    @Override
    public void add(int index, Paragraph element) {

    }

    @Override
    public Paragraph remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Paragraph> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Paragraph> listIterator(int index) {
        return null;
    }

    @Override
    public List<Paragraph> subList(int fromIndex, int toIndex) {
        return null;
    }
}
