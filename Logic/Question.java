package Logic;

import java.util.List;

public class Question{
    private String description;
    private int numOptions;
    private List<String> options;
    private String correctOption;

    //constructor with all parameters present

    public Question(String description, int numOptions, List<String> options, String correctOptions){
        this.description = description;
        this.numOptions = numOptions;
        this.options = options;
        this.correctOption = correctOptions;
    }

    //getters

    public String getDescription(){
        return description;
    }

    public int getNumOptions(){
        return numOptions;
    }

    public List<String> getOptions(){
        return options;
    }

    public String getCorrectOption(){
        return correctOption;
    }

    //setters

     public void setDescription(String description){
        this.description = description;
    }

    public void setNumOptions(int numOptions){
        this.numOptions = numOptions;
    }

    public void setOptions(List<String> options){
        this.options = options;
    }

    public void setCorrectOption(String correctOption){
        this.correctOption = correctOption;
    }

    //This function adds an option (correct or incorrect) to the local question

    public void addOption(String newOption, boolean isCorrect){
        numOptions++;
        options.add(newOption);
        if(isCorrect)   {correctOption = newOption;}
    }

    @Override
    public int hashCode(){
        return description.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Question) || this.hashCode() != other.hashCode()) {return false;}
        return this.description.equalsIgnoreCase(((Question) other).description);
    }

    @Override
    public String toString() {
        return "Question: " + description + ", Options: " + options.toString() + ", Correct Option: " + correctOption;
    }

}