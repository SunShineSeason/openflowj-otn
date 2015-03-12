// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

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

class OFTableModPropVacancyVer14 implements OFTableModPropVacancy {
    private static final Logger logger = LoggerFactory.getLogger(OFTableModPropVacancyVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 8;

        private final static short DEFAULT_VACANCY_DOWN = (short) 0x0;
        private final static short DEFAULT_VACANCY_UP = (short) 0x0;
        private final static short DEFAULT_VACANCY = (short) 0x0;

    // OF message fields
    private final short vacancyDown;
    private final short vacancyUp;
    private final short vacancy;
//
    // Immutable default instance
    final static OFTableModPropVacancyVer14 DEFAULT = new OFTableModPropVacancyVer14(
        DEFAULT_VACANCY_DOWN, DEFAULT_VACANCY_UP, DEFAULT_VACANCY
    );

    // package private constructor - used by readers, builders, and factory
    OFTableModPropVacancyVer14(short vacancyDown, short vacancyUp, short vacancy) {
        this.vacancyDown = vacancyDown;
        this.vacancyUp = vacancyUp;
        this.vacancy = vacancy;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x3;
    }

    @Override
    public short getVacancyDown() {
        return vacancyDown;
    }

    @Override
    public short getVacancyUp() {
        return vacancyUp;
    }

    @Override
    public short getVacancy() {
        return vacancy;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFTableModPropVacancy.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFTableModPropVacancy.Builder {
        final OFTableModPropVacancyVer14 parentMessage;

        // OF message fields
        private boolean vacancyDownSet;
        private short vacancyDown;
        private boolean vacancyUpSet;
        private short vacancyUp;
        private boolean vacancySet;
        private short vacancy;

        BuilderWithParent(OFTableModPropVacancyVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x3;
    }

    @Override
    public short getVacancyDown() {
        return vacancyDown;
    }

    @Override
    public OFTableModPropVacancy.Builder setVacancyDown(short vacancyDown) {
        this.vacancyDown = vacancyDown;
        this.vacancyDownSet = true;
        return this;
    }
    @Override
    public short getVacancyUp() {
        return vacancyUp;
    }

    @Override
    public OFTableModPropVacancy.Builder setVacancyUp(short vacancyUp) {
        this.vacancyUp = vacancyUp;
        this.vacancyUpSet = true;
        return this;
    }
    @Override
    public short getVacancy() {
        return vacancy;
    }

    @Override
    public OFTableModPropVacancy.Builder setVacancy(short vacancy) {
        this.vacancy = vacancy;
        this.vacancySet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFTableModPropVacancy build() {
                short vacancyDown = this.vacancyDownSet ? this.vacancyDown : parentMessage.vacancyDown;
                short vacancyUp = this.vacancyUpSet ? this.vacancyUp : parentMessage.vacancyUp;
                short vacancy = this.vacancySet ? this.vacancy : parentMessage.vacancy;

                //
                return new OFTableModPropVacancyVer14(
                    vacancyDown,
                    vacancyUp,
                    vacancy
                );
        }

    }

    static class Builder implements OFTableModPropVacancy.Builder {
        // OF message fields
        private boolean vacancyDownSet;
        private short vacancyDown;
        private boolean vacancyUpSet;
        private short vacancyUp;
        private boolean vacancySet;
        private short vacancy;

    @Override
    public int getType() {
        return 0x3;
    }

    @Override
    public short getVacancyDown() {
        return vacancyDown;
    }

    @Override
    public OFTableModPropVacancy.Builder setVacancyDown(short vacancyDown) {
        this.vacancyDown = vacancyDown;
        this.vacancyDownSet = true;
        return this;
    }
    @Override
    public short getVacancyUp() {
        return vacancyUp;
    }

    @Override
    public OFTableModPropVacancy.Builder setVacancyUp(short vacancyUp) {
        this.vacancyUp = vacancyUp;
        this.vacancyUpSet = true;
        return this;
    }
    @Override
    public short getVacancy() {
        return vacancy;
    }

    @Override
    public OFTableModPropVacancy.Builder setVacancy(short vacancy) {
        this.vacancy = vacancy;
        this.vacancySet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFTableModPropVacancy build() {
            short vacancyDown = this.vacancyDownSet ? this.vacancyDown : DEFAULT_VACANCY_DOWN;
            short vacancyUp = this.vacancyUpSet ? this.vacancyUp : DEFAULT_VACANCY_UP;
            short vacancy = this.vacancySet ? this.vacancy : DEFAULT_VACANCY;


            return new OFTableModPropVacancyVer14(
                    vacancyDown,
                    vacancyUp,
                    vacancy
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFTableModPropVacancy> {
        @Override
        public OFTableModPropVacancy readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x3
            short type = bb.readShort();
            if(type != (short) 0x3)
                throw new OFParseError("Wrong type: Expected=0x3(0x3), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 8)
                throw new OFParseError("Wrong length: Expected=8(8), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            short vacancyDown = U8.f(bb.readByte());
            short vacancyUp = U8.f(bb.readByte());
            short vacancy = U8.f(bb.readByte());
            // pad: 1 bytes
            bb.skipBytes(1);

            OFTableModPropVacancyVer14 tableModPropVacancyVer14 = new OFTableModPropVacancyVer14(
                    vacancyDown,
                      vacancyUp,
                      vacancy
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", tableModPropVacancyVer14);
            return tableModPropVacancyVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFTableModPropVacancyVer14Funnel FUNNEL = new OFTableModPropVacancyVer14Funnel();
    static class OFTableModPropVacancyVer14Funnel implements Funnel<OFTableModPropVacancyVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFTableModPropVacancyVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x3
            sink.putShort((short) 0x3);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            sink.putShort(message.vacancyDown);
            sink.putShort(message.vacancyUp);
            sink.putShort(message.vacancy);
            // skip pad (1 bytes)
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFTableModPropVacancyVer14> {
        @Override
        public void write(ChannelBuffer bb, OFTableModPropVacancyVer14 message) {
            // fixed value property type = 0x3
            bb.writeShort((short) 0x3);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            bb.writeByte(U8.t(message.vacancyDown));
            bb.writeByte(U8.t(message.vacancyUp));
            bb.writeByte(U8.t(message.vacancy));
            // pad: 1 bytes
            bb.writeZero(1);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFTableModPropVacancyVer14(");
        b.append("vacancyDown=").append(vacancyDown);
        b.append(", ");
        b.append("vacancyUp=").append(vacancyUp);
        b.append(", ");
        b.append("vacancy=").append(vacancy);
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
        OFTableModPropVacancyVer14 other = (OFTableModPropVacancyVer14) obj;

        if( vacancyDown != other.vacancyDown)
            return false;
        if( vacancyUp != other.vacancyUp)
            return false;
        if( vacancy != other.vacancy)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + vacancyDown;
        result = prime * result + vacancyUp;
        result = prime * result + vacancy;
        return result;
    }

}
