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
import java.util.Set;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnFlowChecksumBucketStatsEntryVer13 implements OFBsnFlowChecksumBucketStatsEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnFlowChecksumBucketStatsEntryVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 8;

        private final static U64 DEFAULT_CHECKSUM = U64.ZERO;

    // OF message fields
    private final U64 checksum;
//
    // Immutable default instance
    final static OFBsnFlowChecksumBucketStatsEntryVer13 DEFAULT = new OFBsnFlowChecksumBucketStatsEntryVer13(
        DEFAULT_CHECKSUM
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnFlowChecksumBucketStatsEntryVer13(U64 checksum) {
        if(checksum == null) {
            throw new NullPointerException("OFBsnFlowChecksumBucketStatsEntryVer13: property checksum cannot be null");
        }
        this.checksum = checksum;
    }

    // Accessors for OF message fields
    @Override
    public U64 getChecksum() {
        return checksum;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFBsnFlowChecksumBucketStatsEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnFlowChecksumBucketStatsEntry.Builder {
        final OFBsnFlowChecksumBucketStatsEntryVer13 parentMessage;

        // OF message fields
        private boolean checksumSet;
        private U64 checksum;

        BuilderWithParent(OFBsnFlowChecksumBucketStatsEntryVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public U64 getChecksum() {
        return checksum;
    }

    @Override
    public OFBsnFlowChecksumBucketStatsEntry.Builder setChecksum(U64 checksum) {
        this.checksum = checksum;
        this.checksumSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFBsnFlowChecksumBucketStatsEntry build() {
                U64 checksum = this.checksumSet ? this.checksum : parentMessage.checksum;
                if(checksum == null)
                    throw new NullPointerException("Property checksum must not be null");

                //
                return new OFBsnFlowChecksumBucketStatsEntryVer13(
                    checksum
                );
        }

    }

    static class Builder implements OFBsnFlowChecksumBucketStatsEntry.Builder {
        // OF message fields
        private boolean checksumSet;
        private U64 checksum;

    @Override
    public U64 getChecksum() {
        return checksum;
    }

    @Override
    public OFBsnFlowChecksumBucketStatsEntry.Builder setChecksum(U64 checksum) {
        this.checksum = checksum;
        this.checksumSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFBsnFlowChecksumBucketStatsEntry build() {
            U64 checksum = this.checksumSet ? this.checksum : DEFAULT_CHECKSUM;
            if(checksum == null)
                throw new NullPointerException("Property checksum must not be null");


            return new OFBsnFlowChecksumBucketStatsEntryVer13(
                    checksum
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnFlowChecksumBucketStatsEntry> {
        @Override
        public OFBsnFlowChecksumBucketStatsEntry readFrom(ChannelBuffer bb) throws OFParseError {
            U64 checksum = U64.ofRaw(bb.readLong());

            OFBsnFlowChecksumBucketStatsEntryVer13 bsnFlowChecksumBucketStatsEntryVer13 = new OFBsnFlowChecksumBucketStatsEntryVer13(
                    checksum
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnFlowChecksumBucketStatsEntryVer13);
            return bsnFlowChecksumBucketStatsEntryVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnFlowChecksumBucketStatsEntryVer13Funnel FUNNEL = new OFBsnFlowChecksumBucketStatsEntryVer13Funnel();
    static class OFBsnFlowChecksumBucketStatsEntryVer13Funnel implements Funnel<OFBsnFlowChecksumBucketStatsEntryVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnFlowChecksumBucketStatsEntryVer13 message, PrimitiveSink sink) {
            message.checksum.putTo(sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnFlowChecksumBucketStatsEntryVer13> {
        @Override
        public void write(ChannelBuffer bb, OFBsnFlowChecksumBucketStatsEntryVer13 message) {
            bb.writeLong(message.checksum.getValue());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnFlowChecksumBucketStatsEntryVer13(");
        b.append("checksum=").append(checksum);
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
        OFBsnFlowChecksumBucketStatsEntryVer13 other = (OFBsnFlowChecksumBucketStatsEntryVer13) obj;

        if (checksum == null) {
            if (other.checksum != null)
                return false;
        } else if (!checksum.equals(other.checksum))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((checksum == null) ? 0 : checksum.hashCode());
        return result;
    }

}
