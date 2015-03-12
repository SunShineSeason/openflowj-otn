// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.projectfloodlight.openflow.protocol.OFBadRequestCode;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFBadRequestCodeSerializerVer10 {

    public final static short BAD_VERSION_VAL = (short) 0x0;
    public final static short BAD_TYPE_VAL = (short) 0x1;
    public final static short BAD_STAT_VAL = (short) 0x2;
    public final static short BAD_EXPERIMENTER_VAL = (short) 0x3;
    public final static short BAD_SUBTYPE_VAL = (short) 0x4;
    public final static short EPERM_VAL = (short) 0x5;
    public final static short BAD_LEN_VAL = (short) 0x6;
    public final static short BUFFER_EMPTY_VAL = (short) 0x7;
    public final static short BUFFER_UNKNOWN_VAL = (short) 0x8;

    public static OFBadRequestCode readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFBadRequestCode e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFBadRequestCode e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFBadRequestCode ofWireValue(short val) {
        switch(val) {
            case BAD_VERSION_VAL:
                return OFBadRequestCode.BAD_VERSION;
            case BAD_TYPE_VAL:
                return OFBadRequestCode.BAD_TYPE;
            case BAD_STAT_VAL:
                return OFBadRequestCode.BAD_STAT;
            case BAD_EXPERIMENTER_VAL:
                return OFBadRequestCode.BAD_EXPERIMENTER;
            case BAD_SUBTYPE_VAL:
                return OFBadRequestCode.BAD_SUBTYPE;
            case EPERM_VAL:
                return OFBadRequestCode.EPERM;
            case BAD_LEN_VAL:
                return OFBadRequestCode.BAD_LEN;
            case BUFFER_EMPTY_VAL:
                return OFBadRequestCode.BUFFER_EMPTY;
            case BUFFER_UNKNOWN_VAL:
                return OFBadRequestCode.BUFFER_UNKNOWN;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFBadRequestCode in version 1.0: " + val);
        }
    }


    public static short toWireValue(OFBadRequestCode e) {
        switch(e) {
            case BAD_VERSION:
                return BAD_VERSION_VAL;
            case BAD_TYPE:
                return BAD_TYPE_VAL;
            case BAD_STAT:
                return BAD_STAT_VAL;
            case BAD_EXPERIMENTER:
                return BAD_EXPERIMENTER_VAL;
            case BAD_SUBTYPE:
                return BAD_SUBTYPE_VAL;
            case EPERM:
                return EPERM_VAL;
            case BAD_LEN:
                return BAD_LEN_VAL;
            case BUFFER_EMPTY:
                return BUFFER_EMPTY_VAL;
            case BUFFER_UNKNOWN:
                return BUFFER_UNKNOWN_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFBadRequestCode in version 1.0: " + e);
        }
    }

}
