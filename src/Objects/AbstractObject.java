package Objects;

import java.util.Scanner;

public abstract class AbstractObject {
    protected String[] data;

    protected String[] OptionsInputMessages;

    public AbstractObject(String[] OptionsInputMessages) {
        this.setOptionsInputMessages(OptionsInputMessages);
    }

    public String[] getData() {
        return this.data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public String[] getOptionsInputMessages() {
        return OptionsInputMessages;
    }

    public void setOptionsInputMessages(String[] optionsInputMessages) {
        OptionsInputMessages = optionsInputMessages;
    }

    public String[] promptInput() {
        String[] output = new String[getOptionsInputMessages().length];
        System.out.println("Input " + getOptionsInputMessages().length + " data");
        for (int i = 0; i < getOptionsInputMessages().length; i++) {
            System.out.print(getOptionsInputMessages()[i]);
            Scanner scanner = new Scanner(System.in);
            output[i] = scanner.next();
        }

        return output;
    }
}