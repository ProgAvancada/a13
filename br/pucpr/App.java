package br.pucpr;

import br.pucpr.br.pucpr.gui.Component;
import br.pucpr.br.pucpr.gui.Button;
import br.pucpr.br.pucpr.gui.Checkbox;


import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class App extends JComponent {
    private boolean isDrawingCircle = false;

    private Button button = new Button(100, 100, 100, 50);
    private Checkbox checkbox = new Checkbox(300, 100, 25, 25);

    private List<Component> components = new ArrayList<>();

    public App() {
        add(button);
        add(checkbox);
        button.setListener(btn ->  isDrawingCircle = !isDrawingCircle);
    }

    /**
     * Adiciona um componente a aplicação, ja definindo os respectivos listeners
     * @param c O componente a ser adicionado
     */
    public void add(Component c) {
        components.add(c);
        addMouseListener(c);
        addMouseMotionListener(c);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Percorre os componentes associados a aplicação e chama a pintura, já copiando o contexto gráfico
        for (Component c : components) {
            Graphics2D g2d = (Graphics2D) g.create();
            c.paint(g2d);
            g2d.dispose();
        }

        if (isDrawingCircle) {
            g.setColor(Color.BLUE);
            g.fillOval(button.getX(),
                    button.getY() + button.getH() + 50,
                    25, 25);
        }

        repaint();
    }
}
