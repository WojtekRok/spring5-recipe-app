package pl.wojtekrok.springrecipeapp.converters;

import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import pl.wojtekrok.springrecipeapp.commands.NotesCommand;
import pl.wojtekrok.springrecipeapp.domain.Notes;

@Component
public class NotesCommandToNotes implements Converter<NotesCommand, Notes> {


    @Synchronized
    @Nullable
    @Override
    public Notes convert(NotesCommand notesCommand) {
        if(notesCommand == null) {
            return null;
        }
        final Notes notes = new Notes();
        notes.setId(notesCommand.getId());
        notes.setRecipeNotes(notesCommand.getRecipeNotes());
        return notes;
    }
}
