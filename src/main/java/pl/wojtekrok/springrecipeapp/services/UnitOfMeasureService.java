package pl.wojtekrok.springrecipeapp.services;

import pl.wojtekrok.springrecipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
