import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazRestaurante {
    private JFrame frame;
    private JTextArea menuArea;
    private JTextArea pedidosArea;

    public InterfazRestaurante() {
        frame = new JFrame("Sistema de Gestión de Restaurante");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Panel de menú
        menuArea = new JTextArea();
        menuArea.setEditable(false);
        JScrollPane menuScroll = new JScrollPane(menuArea);
        frame.add(menuScroll, BorderLayout.CENTER);

        // Panel de pedidos
        pedidosArea = new JTextArea();
        pedidosArea.setEditable(false);
        JScrollPane pedidosScroll = new JScrollPane(pedidosArea);
        frame.add(pedidosScroll, BorderLayout.EAST);

        // Botones
        JPanel panelBotones = new JPanel();
        JButton agregarPlatoButton = new JButton("Agregar Plato");
        JButton verPedidosButton = new JButton("Ver Pedidos");

        panelBotones.add(agregarPlatoButton);
        panelBotones.add(verPedidosButton);
        frame.add(panelBotones, BorderLayout.SOUTH);

        agregarPlatoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar plato
                menuArea.append("Plato agregado: Ejemplo\n");
            }
        });

        verPedidosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pedidosArea.append("Pedidos actuales: Ejemplo\n");
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new InterfazRestaurante();
    }
}
