// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFInstructionIdBsnRequireVlanXlateVer13 implements OFInstructionIdBsnRequireVlanXlate {
    private static final Logger logger = LoggerFactory.getLogger(OFInstructionIdBsnRequireVlanXlateVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 12;


    // OF message fields
//
    // Immutable default instance
    final static OFInstructionIdBsnRequireVlanXlateVer13 DEFAULT = new OFInstructionIdBsnRequireVlanXlateVer13(

    );

    final static OFInstructionIdBsnRequireVlanXlateVer13 INSTANCE = new OFInstructionIdBsnRequireVlanXlateVer13();
    // private empty constructor - use shared instance!
    private OFInstructionIdBsnRequireVlanXlateVer13() {
    }

    // Accessors for OF message fields
    @Override
    public OFInstructionType getType() {
        return OFInstructionType.EXPERIMENTER;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x8L;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    // no data members - do not support builder
    public OFInstructionIdBsnRequireVlanXlate.Builder createBuilder() {
        throw new UnsupportedOperationException("OFInstructionIdBsnRequireVlanXlateVer13 has no mutable properties -- builder unneeded");
    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFInstructionIdBsnRequireVlanXlate> {
        @Override
        public OFInstructionIdBsnRequireVlanXlate readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 65535
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=OFInstructionType.EXPERIMENTER(65535), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 12)
                throw new OFParseError("Wrong length: Expected=12(12), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0x8L
            int subtype = bb.readInt();
            if(subtype != 0x8)
                throw new OFParseError("Wrong subtype: Expected=0x8L(0x8L), got="+subtype);

            if(logger.isTraceEnabled())
                logger.trace("readFrom - returning shared instance={}", INSTANCE);
            return INSTANCE;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFInstructionIdBsnRequireVlanXlateVer13Funnel FUNNEL = new OFInstructionIdBsnRequireVlanXlateVer13Funnel();
    static class OFInstructionIdBsnRequireVlanXlateVer13Funnel implements Funnel<OFInstructionIdBsnRequireVlanXlateVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFInstructionIdBsnRequireVlanXlateVer13 message, PrimitiveSink sink) {
            // fixed value property type = 65535
            sink.putShort((short) 0xffff);
            // fixed value property length = 12
            sink.putShort((short) 0xc);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x8L
            sink.putInt(0x8);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFInstructionIdBsnRequireVlanXlateVer13> {
        @Override
        public void write(ChannelBuffer bb, OFInstructionIdBsnRequireVlanXlateVer13 message) {
            // fixed value property type = 65535
            bb.writeShort((short) 0xffff);
            // fixed value property length = 12
            bb.writeShort((short) 0xc);
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x8L
            bb.writeInt(0x8);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFInstructionIdBsnRequireVlanXlateVer13(");
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;

        return result;
    }

}
