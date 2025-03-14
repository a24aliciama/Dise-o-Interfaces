import java.awt.*;
import javax.swing.*;

public class EstructuraWebBasica extends JFrame {

    public EstructuraWebBasica() {
		
        //Windows
        setTitle("Estructura Web Replica");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //Colores
        Color indianRed = new Color(205, 92, 92);
        Color darkKhaki = new Color(189, 183, 107);
        Color white = Color.WHITE;

        //Fuentes
        Font font = new Font("Arial", Font.BOLD, 20);

        //Header
        JLabel header = new JLabel("<header>", SwingConstants.CENTER);
        header.setFont(font);
        header.setOpaque(true);
        header.setBackground(indianRed);
        header.setForeground(white);
        header.setPreferredSize(new Dimension(800, 50));
        add(header, BorderLayout.NORTH);

        //Footer
        JLabel footer = new JLabel("<footer>", SwingConstants.CENTER);
        footer.setFont(font);
        footer.setOpaque(true);
        footer.setBackground(indianRed);
        footer.setForeground(white);
        footer.setPreferredSize(new Dimension(800, 50));
        add(footer, BorderLayout.SOUTH);

        //Panel central
        JPanel container = new JPanel();
        container.setLayout(new BorderLayout(10, 10)); //Espacio entre componentes
        container.setBackground(Color.WHITE);
        add(container, BorderLayout.CENTER);

        //Nav
        JLabel nav = new JLabel("<nav>", SwingConstants.CENTER);
        nav.setFont(font);
        nav.setOpaque(true);
        nav.setBackground(indianRed);
        nav.setForeground(white);
        nav.setPreferredSize(new Dimension(100, 400));
        container.add(nav, BorderLayout.WEST);

        //Aside
        JLabel aside = new JLabel("<aside>", SwingConstants.CENTER);
        aside.setFont(font);
        aside.setOpaque(true);
        aside.setBackground(indianRed);
        aside.setForeground(white);
        aside.setPreferredSize(new Dimension(100, 400));
        container.add(aside, BorderLayout.EAST);

        //Section
        JPanel sectionPanel = new JPanel();
        sectionPanel.setLayout(new BorderLayout(10, 10));
        sectionPanel.setBackground(indianRed);
        container.add(sectionPanel, BorderLayout.CENTER);

        //Section Title
        JLabel sectionTitle = new JLabel("<section>", SwingConstants.LEFT);
        sectionTitle.setFont(font);
        sectionTitle.setForeground(white);
        sectionTitle.setPreferredSize(new Dimension(600, 30));
        sectionPanel.add(sectionTitle, BorderLayout.NORTH);

        //Section Header
        JLabel sectionHeader = new JLabel("<header>", SwingConstants.CENTER);
        sectionHeader.setFont(font);
        sectionHeader.setOpaque(true);
        sectionHeader.setBackground(darkKhaki);
        sectionHeader.setForeground(white);
        sectionHeader.setPreferredSize(new Dimension(600, 50));
        sectionPanel.add(sectionHeader, BorderLayout.NORTH);

        //Section Article
        JLabel article = new JLabel("<article>", SwingConstants.CENTER);
        article.setFont(font);
        article.setOpaque(true);
        article.setBackground(darkKhaki);
        article.setForeground(white);
        sectionPanel.add(article, BorderLayout.CENTER);

        //Section Footer
        JLabel sectionFooter = new JLabel("<footer>", SwingConstants.CENTER);
        sectionFooter.setFont(font);
        sectionFooter.setOpaque(true);
        sectionFooter.setBackground(darkKhaki);
        sectionFooter.setForeground(white);
        sectionFooter.setPreferredSize(new Dimension(600, 80));
        sectionPanel.add(sectionFooter, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new EstructuraWebBasica();
    }
}
