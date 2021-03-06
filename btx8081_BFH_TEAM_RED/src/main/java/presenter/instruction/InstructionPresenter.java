package presenter.instruction;


import java.util.ArrayList;

import model.instruction.InstructionModel;
import view.instruction.InstructionViewInterface;

/**
 * Gets data from InstructionModel and sets instructions for InstructionView
 */
public class InstructionPresenter {

    ArrayList<InstructionModel> models;
    InstructionViewInterface view;

    /**
     * Handles InstructionView and InstructionModel data
     *
     * @param view InstructionViewInterface
     */
    public InstructionPresenter(InstructionViewInterface view) {
        this.models = InstructionModel.getInstructionsFromDB();
        this.view = view;
    }

    /**
     * Returns instruction data as an ArrayList from InstructionModel
     *
     * @return ArrayList<> of instructions
     */
    public ArrayList<ArrayList<String>> getInstructions() {
        ArrayList<ArrayList<String>> instructions = new ArrayList<>();
        for (InstructionModel model : models) {
            ArrayList<String> instruction = new ArrayList<>();
            instruction.add(model.getTitle());
            instruction.add(model.getText());
            instructions.add(instruction);
        }
        return instructions;
    }
}
