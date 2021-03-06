// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol;

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
import java.util.List;
import org.jboss.netty.buffer.ChannelBuffer;

public interface OFMeterStats extends OFObject {
    long getMeterId();
    long getFlowCount();
    U64 getPacketInCount();
    U64 getByteInCount();
    long getDurationSec();
    long getDurationNsec();
    List<OFMeterBandStats> getBandStats();
    OFVersion getVersion();


    void writeTo(ChannelBuffer channelBuffer);

    Builder createBuilder();
    public interface Builder  {
        OFMeterStats build();
        long getMeterId();
        Builder setMeterId(long meterId);
        long getFlowCount();
        Builder setFlowCount(long flowCount);
        U64 getPacketInCount();
        Builder setPacketInCount(U64 packetInCount);
        U64 getByteInCount();
        Builder setByteInCount(U64 byteInCount);
        long getDurationSec();
        Builder setDurationSec(long durationSec);
        long getDurationNsec();
        Builder setDurationNsec(long durationNsec);
        List<OFMeterBandStats> getBandStats();
        Builder setBandStats(List<OFMeterBandStats> bandStats);
        OFVersion getVersion();
    }
}
