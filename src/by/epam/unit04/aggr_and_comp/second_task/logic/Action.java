package by.epam.unit04.aggr_and_comp.second_task.logic;

import by.epam.unit04.aggr_and_comp.second_task.entity.Sentence;
import by.epam.unit04.aggr_and_comp.second_task.entity.Text;

public class Action {
    public void addText(Text text, Sentence sentence){
        text.getListSentence().add(sentence);
    }
    public void showText(Text text){
        String str = new String("");
        for(Sentence sentence:text.getListSentence()) {
            str +=sentence;
        }
        System.out.println(str);
    }
    public void showTitle(Text text){
        System.out.println(text.getTitle());
    }
}
