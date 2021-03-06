// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_UpdateCheckinNoteFieldName;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _RepositorySoap_UpdateCheckinNoteFieldName
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String path;
    protected String existingFieldName;
    protected String newFieldName;

    public _RepositorySoap_UpdateCheckinNoteFieldName()
    {
        super();
    }

    public _RepositorySoap_UpdateCheckinNoteFieldName(
        final String path,
        final String existingFieldName,
        final String newFieldName)
    {
        // TODO : Call super() instead of setting all fields directly?
        setPath(path);
        setExistingFieldName(existingFieldName);
        setNewFieldName(newFieldName);
    }

    public String getPath()
    {
        return this.path;
    }

    public void setPath(String value)
    {
        this.path = value;
    }

    public String getExistingFieldName()
    {
        return this.existingFieldName;
    }

    public void setExistingFieldName(String value)
    {
        this.existingFieldName = value;
    }

    public String getNewFieldName()
    {
        return this.newFieldName;
    }

    public void setNewFieldName(String value)
    {
        this.newFieldName = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "path",
            this.path);
        XMLStreamWriterHelper.writeElement(
            writer,
            "existingFieldName",
            this.existingFieldName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "newFieldName",
            this.newFieldName);

        writer.writeEndElement();
    }
}
