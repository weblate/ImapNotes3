package com.Pau.ImapNotes2.Miscs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import javax.mail.Folder;

public class ImapNotes2Result {

    public final int returnCode;
    @NonNull
    public final String errorMessage;
    public final Long UIDValidity;
    @Nullable
    public final Folder notesFolder;

    public ImapNotes2Result(int returnCode,
                            String errorMessage,
                            long UIDValidity,
                            Folder notesFolder) {
        this.returnCode = returnCode;
        this.errorMessage = errorMessage;
        this.UIDValidity = UIDValidity;
        this.notesFolder = notesFolder;
    }

/*
    public ImapNotes2Result() {
        returnCode = -1;
        errorMessage = "";
        UIDValidity = (long) -1;
        //hasUIDPLUS = true;
        notesFolder = null;
    }
*/

}
