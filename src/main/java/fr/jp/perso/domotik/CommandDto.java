package fr.jp.perso.domotik;

import java.util.ArrayList;
import java.util.List;

public class CommandDto {
    private String name;
    private List<CommandParameterDto> commandParameters;

    public CommandDto() {

    }

    public CommandDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<CommandParameterDto> getCommandParameters() {
        if (commandParameters == null) {
            commandParameters = new ArrayList<>();
        }
        return commandParameters;
    }
}
