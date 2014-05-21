/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkboxlist;

/**
 *
 * @author pannawat.janthong
 */
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxList extends JList
{
   protected static Border noFocusBorder = new EmptyBorder(1, 1, 1, 1);

   public CheckBoxList()
   {
      setCellRenderer(new CellRenderer());

      addMouseListener(new MouseAdapter()
         {
            public void mousePressed(MouseEvent e)
            {
               int index = locationToIndex(e.getPoint());

               if (index != -1) {
                    JCheckBox checkbox = (JCheckBox)getModel().getElementAt(index);
                    if(checkbox.isSelected()){
                        checkbox.setSelected(false);
                    } else {
                        checkbox.setSelected(true);
                    }
                    repaint();

               }
            }
         }
      );

      setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      setSelectionForeground(Color.BLACK);
      //setSelectionBackground(Color.BLUE);
   }
   
    public void addCheckbox(JCheckBox checkBox) {
        ListModel currentList = this.getModel();
        JCheckBox[] newList = new JCheckBox[currentList.getSize() + 1];
        for (int i = 0; i < currentList.getSize(); i++) {
            newList[i] = (JCheckBox) currentList.getElementAt(i);
        }
        newList[newList.length - 1] = checkBox;
        this.setListData(newList);
    }
    
    public void clear(){
        this.setListData(new JCheckBox[0]);
    }

   protected class CellRenderer implements ListCellRenderer
   {
      public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
      {
        JCheckBox checkbox = (JCheckBox) value;
        checkbox.setBackground(isSelected ? getSelectionBackground() : getBackground());
        checkbox.setForeground(isSelected ? getSelectionForeground() : getForeground());
        checkbox.setEnabled(isEnabled());
        checkbox.setFont(getFont());
        checkbox.setFocusPainted(false);
        checkbox.setBorderPainted(true);
        checkbox.setBorder(isSelected ? UIManager.getBorder("List.focusCellHighlightBorder") : noFocusBorder);
        return checkbox;
      }
   }
   
   
   
   
}