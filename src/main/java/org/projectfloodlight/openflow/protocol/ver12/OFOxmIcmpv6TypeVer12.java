// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver12;

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
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFOxmIcmpv6TypeVer12 implements OFOxmIcmpv6Type {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmIcmpv6TypeVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 5;

        private final static U8 DEFAULT_VALUE = U8.ZERO;

    // OF message fields
    private final U8 value;
//
    // Immutable default instance
    final static OFOxmIcmpv6TypeVer12 DEFAULT = new OFOxmIcmpv6TypeVer12(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmIcmpv6TypeVer12(U8 value) {
        if(value == null) {
            throw new NullPointerException("OFOxmIcmpv6TypeVer12: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80003a01L;
    }

    @Override
    public U8 getValue() {
        return value;
    }

    @Override
    public MatchField<U8> getMatchField() {
        return MatchField.ICMPV6_TYPE;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<U8> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public U8 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmIcmpv6Type.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmIcmpv6Type.Builder {
        final OFOxmIcmpv6TypeVer12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private U8 value;

        BuilderWithParent(OFOxmIcmpv6TypeVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80003a01L;
    }

    @Override
    public U8 getValue() {
        return value;
    }

    @Override
    public OFOxmIcmpv6Type.Builder setValue(U8 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<U8> getMatchField() {
        return MatchField.ICMPV6_TYPE;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<U8> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public U8 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmIcmpv6Type build() {
                U8 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmIcmpv6TypeVer12(
                    value
                );
        }

    }

    static class Builder implements OFOxmIcmpv6Type.Builder {
        // OF message fields
        private boolean valueSet;
        private U8 value;

    @Override
    public long getTypeLen() {
        return 0x80003a01L;
    }

    @Override
    public U8 getValue() {
        return value;
    }

    @Override
    public OFOxmIcmpv6Type.Builder setValue(U8 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<U8> getMatchField() {
        return MatchField.ICMPV6_TYPE;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<U8> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public U8 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmIcmpv6Type build() {
            U8 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmIcmpv6TypeVer12(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmIcmpv6Type> {
        @Override
        public OFOxmIcmpv6Type readFrom(ChannelBuffer bb) throws OFParseError {
            // fixed value property typeLen == 0x80003a01L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80003a01)
                throw new OFParseError("Wrong typeLen: Expected=0x80003a01L(0x80003a01L), got="+typeLen);
            U8 value = U8.of(bb.readByte());

            OFOxmIcmpv6TypeVer12 oxmIcmpv6TypeVer12 = new OFOxmIcmpv6TypeVer12(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmIcmpv6TypeVer12);
            return oxmIcmpv6TypeVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmIcmpv6TypeVer12Funnel FUNNEL = new OFOxmIcmpv6TypeVer12Funnel();
    static class OFOxmIcmpv6TypeVer12Funnel implements Funnel<OFOxmIcmpv6TypeVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmIcmpv6TypeVer12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80003a01L
            sink.putInt((int) 0x80003a01);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmIcmpv6TypeVer12> {
        @Override
        public void write(ChannelBuffer bb, OFOxmIcmpv6TypeVer12 message) {
            // fixed value property typeLen = 0x80003a01L
            bb.writeInt((int) 0x80003a01);
            bb.writeByte(message.value.getRaw());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmIcmpv6TypeVer12(");
        b.append("value=").append(value);
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
        OFOxmIcmpv6TypeVer12 other = (OFOxmIcmpv6TypeVer12) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
