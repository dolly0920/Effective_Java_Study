package com.example.sypark9646.item22;

import java.io.SerializablePermission;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomObjectStreamConstants {

    static final short STREAM_MAGIC = (short) 0xaced;
    static final short STREAM_VERSION = 5;
    static final byte TC_BASE = 0x70;
    static final byte TC_NULL = (byte) 0x70;
    static final byte TC_REFERENCE = (byte) 0x71;
    static final byte TC_CLASSDESC = (byte) 0x72;
    static final byte TC_OBJECT = (byte) 0x73;
    static final byte TC_STRING = (byte) 0x74;
    static final byte TC_ARRAY = (byte) 0x75;
    static final byte TC_CLASS = (byte) 0x76;
    static final byte TC_BLOCKDATA = (byte) 0x77;
    static final byte TC_ENDBLOCKDATA = (byte) 0x78;
    static final byte TC_RESET = (byte) 0x79;
    static final byte TC_BLOCKDATALONG = (byte) 0x7A;
    static final byte TC_EXCEPTION = (byte) 0x7B;
    static final byte TC_LONGSTRING = (byte) 0x7C;
    static final byte TC_PROXYCLASSDESC = (byte) 0x7D;
    static final byte TC_ENUM = (byte) 0x7E;
    static final byte TC_MAX = (byte) 0x7E;
    static final int baseWireHandle = 0x7e0000;
    static final byte SC_WRITE_METHOD = 0x01;
    static final byte SC_BLOCK_DATA = 0x08;
    static final byte SC_SERIALIZABLE = 0x02;
    static final byte SC_EXTERNALIZABLE = 0x04;
    static final byte SC_ENUM = 0x10;
    static final SerializablePermission SUBSTITUTION_PERMISSION = new SerializablePermission("enableSubstitution");
    static final SerializablePermission SUBCLASS_IMPLEMENTATION_PERMISSION =
        new SerializablePermission("enableSubclassImplementation");
    static final SerializablePermission SERIAL_FILTER_PERMISSION = new SerializablePermission("serialFilter");
    public static final int PROTOCOL_VERSION_1 = 1;
    public static final int PROTOCOL_VERSION_2 = 2;
}
