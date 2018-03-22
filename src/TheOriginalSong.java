import java.util.List;

public class TheOriginalSong extends Song{

    public List<Paragraph> paragraphs;

    public TheOriginalSong(){
        super.speed = 40.0f;

        Paragraph qianZou = new Paragraph();
        Sentence qianZouS1 = new Sentence();
        Sentence qianZouS2 = new Sentence();


        String s1 = "[++1.4][+7.4][+6.4][+5.4][+6.16][+6.4][+5.4][+4.4][+2.4][+3.8][+2.8]";
        qianZouS1.addText(s1);
        qianZouS1.addText("[+1.4][7.4][+1.4][+3.4][+2.8][7.4][5.4][6.16]");

        qianZouS2.addText("[6.8][7.8][+1.4][7.4][6.4][5.4][6.16][6.4][5.4][4.4][2.4][3.8][2.8]");
        qianZouS2.addText(("[1.4][-7.4][1.4][3.4][2.8][5.8][6.32][P.28]"));

        Paragraph p1 = new Paragraph();
        Sentence p1s1 = new Sentence();
        p1s1.addText("[1.4][-7.4][1.4][3.4][2.8][-7.4][-5.4][-6.32]");
        Sentence p1s2 = new Sentence();
        p1s2.addText("[1.4][2.4][3.4][6.8][5.4][#4.4][2.4][3.28]");
        Sentence p1s3 = new Sentence();
        p1s3.addText("[3.4][5.4][6.8][7.8][5.12][3.4][4.4][3.4][4.4][6.4][5.8]");
        Sentence p1s4 = new Sentence();
        p1s4.addText("[3.4][2.4][1.24][-6.4][-7.4][1.4][2.16][3.12]");

        p1.addSentence(p1s1);
        p1.addSentence(p1s2);
        p1.addSentence(p1s3);
        p1.addSentence(p1s4);

        Paragraph p2 = new Paragraph();
        Sentence p2s1 = new Sentence();
        p2s1.addText("[-7.4][1.4][-7.4][1.4][3.4][2.8][-7.4][-5.4][-6.32]");
        Sentence p2s2 = new Sentence();
        p2s2.addText("[1.4][2.4][3.4][6.8][5.4][#4.4][2.4][3.24]");
        Sentence p2s3 = new Sentence();
        p2s3.addText("[3.4][5.4][6.8][7.8][5.12][3.4][4.4][3.4][4.4][6.4][5.16]");
        Sentence p2s4 = new Sentence();
        p2s4.addText("[1.4][-7.4][1.4][3.4][2.8][-7.4][-5.4][-6.32][P.32]");

        p2.addSentence(p2s1);
        p2.addSentence(p2s2);
        p2.addSentence(p2s3);
        p2.addSentence(p2s4);

        Paragraph p3 = new Paragraph();

        Sentence p3s1 = new Sentence();
        p3s1.addText("[3.8][5.8][#4.20][3.4][5.4][6.4][#4.4][3.4][2.8][3.32][P.32]");
        Sentence p3s2 = new Sentence();
        p3s2.addText("[3.8][5.8][#4.20][3.4][5.4][6.4][#4.4][3.4][2.8][3.32][P.32]");
        Sentence p3s3 = new Sentence();
        p3s3.addText("[3.4][5.4][6.8][7.8][5.12][3.4][4.4][3.4][4.4][6.4][5.16]");
        Sentence p3s4 = new Sentence();
        p3s4.addText("[1.4][-7.4][1.4][3.4][2.8][-7.4][-5.4][-6.32]");

        p3.addSentence(p3s1);
        p3.addSentence(p3s2);
        p3.addSentence(p3s3);
        p3.addSentence(p3s4);



        Paragraph qianZou2 = new Paragraph();

        Sentence qianZou2s1 = new Sentence();
        qianZou2s1.addText("[++1.4][+7.4][+6.4][+5.4][+6.16][+6.4][+5.4][+4.4][+2.4][+3.8][+2.8]");
        qianZou2s1.addText("[+1.4][7.4][+1.4][+3.4][+2.8][7.4][5.4][6.16]");
        Sentence qianZou2s2 = new Sentence();
        qianZou2s2.addText("[6.8][7.8][+1.4][7.4][6.4][5.4][6.16][6.4][5.4][4.4][2.4][3.8][2.8]");
        qianZou2s2.addText("[1.4][-7.4][1.4][3.4][2.8][5.8][6.32][P.28]");

        qianZou2.addSentence(qianZou2s1);
        qianZou2.addSentence(qianZou2s2);



        Paragraph p4 = new Paragraph();

        Sentence p4s1 = new Sentence();
        p4s1.addText("[1.12][2.4][3.8][5.8][2.24][1.4][-7.4][-6.24][-5.4][-7.4][-6.28]");
        Sentence p4s2 = new Sentence();
        p4s2.addText("[-7.4][1.12][2.4][3.8][5.8][2.28][1.4][2.12][3.4][4.8][6.8][3.24]");

        p4.addSentence(p4s1);
        p4.addSentence(p4s2);

        Paragraph p5 = new Paragraph();
        Sentence p5s1 = new Sentence();
        p5s1.addText("[3.8][6.32][P.8][6.8][5.8][3.12][5.12][3.28]");
        Sentence p5s2 = new Sentence();
        p5s2.addText("[3.8][6.32][P.8][6.8][5.8][6.32][P.12]");
        Sentence p5s3 = new Sentence();
        p5s3.addText("[3.8][6.4][5.2][6.32][P.4][6.8][5.8][3.12][5.12][3.28]");
        Sentence p5s4 = new Sentence();
        p5s4.addText(("[3.8][6.32][P.8][+1.8][7.4][+1.2][7.2][6.28]"));

        p5.addSentence(p5s1);
        p5.addSentence(p5s2);
        p5.addSentence(p5s3);
        p5.addSentence(p5s4);

        Paragraph jianZou = new Paragraph();
        Sentence jianZous1 = new Sentence();
        jianZous1.addText("[+1.8][7.8][6.8][5.4][4.2][5.2][6.12][7.16][+1.8][7.8][6.8][5.8]");
        Sentence jianZous2 = new Sentence();
        jianZous2.addText("[#4.12][6.12][#4.8][6.8][#5.24]");
        Sentence jianZous3 = new Sentence();
        jianZous3.addText("[#5.12][7.8][#5.8][7.8][6.8][7.8][+1.4]");

        jianZou.addSentence(jianZous1);
        jianZou.addSentence(jianZous2);
        jianZou.addSentence(jianZous3);


        Paragraph p6 = new Paragraph();
        Sentence p6s1 = new Sentence();
        p6s1.addText("[-7.4][1.4][-7.4][1.4][3.4][2.8][-7.4][-5.4][-6.32]");
        Sentence p6s2 = new Sentence();
        p6s2.addText("[1.4][2.4][3.4][6.8][5.4][#4.4][2.4][3.24]");
        Sentence p6s3 = new Sentence();
        p6s3.addText("[3.4][5.4][6.8][7.8][5.12][3.4][4.4][3.4][4.4][6.4][5.16]");
        Sentence p6s4 = new Sentence();
        p6s4.addText("[1.4][-7.4][1.4][3.4][2.8][-7.4][-5.4][-6.24]");

        p6.addSentence(p6s1);
        p6.addSentence(p6s2);
        p6.addSentence(p6s3);
        p6.addSentence(p6s4);

        Paragraph p7 = new Paragraph();

        Sentence p7s1 = new Sentence();
        p7s1.addText("[3.4][5.4][6.8][7.6][5.2][6.2][5.10]");
        Sentence p7s2 = new Sentence();
        p7s2.addText("[3.4][4.4][3.4][4.4][6.4][5.16]");
        Sentence p7s3 = new Sentence();
        p7s3.addText("[1.4][-7.4][1.4][3.4][2.12][1.4][2.4][#1.4][2.4][5.4][3.12]");
        Sentence p7s4 = new Sentence();
        p7s4.addText("[3.4][4.4][3.4][4.4][6.4][5.8][3.8][6.32][P.8]");
        Sentence p7s5 = new Sentence();
        p7s5.addText("[+1.8][7.4][+1.2][7.2][6.32][P.24]");

        p7.addSentence(p7s1);
        p7.addSentence(p7s2);
        p7.addSentence(p7s3);
        p7.addSentence(p7s4);
        p7.addSentence(p7s5);

        Paragraph weiSheng = new Paragraph();
        Sentence weiShengs1 = new Sentence();
        weiShengs1.addText("[++1.4][+7.4][+6.4][+5.4][+6.16][+6.4][+5.4][+4.4][+2.4][+3.8][+2.8]");
        weiShengs1.addText("[+1.4][7.4][+1.4][+3.4][+2.8][7.4][5.4][6.16]");

        Sentence weiShengs2 = new Sentence();
        weiShengs2.addText("[6.8][7.8][+1.4][7.4][6.4][5.4][6.16][6.4][5.4][4.4][2.4][3.8][2.8]");
        weiShengs2.addText("[1.4][-7.4][1.4][3.4][2.8][5.8][6.32][P.28]");

        weiSheng.addSentence(weiShengs1);
        weiSheng.addSentence(weiShengs2);




        qianZou.addSentence(qianZouS1);
        qianZou.addSentence(qianZouS2);
        super.addParagraph(qianZou);
        super.addParagraph(p1);
        super.addParagraph(p2);
        super.addParagraph(p3);
        super.addParagraph(qianZou2);
        super.addParagraph(p4);
        super.addParagraph(p5);

        super.addParagraph(jianZou);
        super.addParagraph(p6);
        super.addParagraph(p7);

        super.addParagraph(weiSheng);

//        this.paragraphs.addAll(super.paragraphs);
    }


    // Compose the true dragonsong!!!




}
