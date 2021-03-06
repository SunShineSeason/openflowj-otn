// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
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
import org.jboss.netty.buffer.ChannelBuffer;

abstract class OFOxmVer13 {
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 4;


    public final static OFOxmVer13.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFOxm<?>> {
        @Override
        public OFOxm<?> readFrom(ChannelBuffer bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            int typeLen = bb.readInt();
            bb.readerIndex(start);
            switch(typeLen) {
               case (int) 0x80002a02:
                   // discriminator value 0x80002a02L=0x80002a02L for class OFOxmArpOpVer13
                   return OFOxmArpOpVer13.READER.readFrom(bb);
               case (int) 0x80002b04:
                   // discriminator value 0x80002b04L=0x80002b04L for class OFOxmArpOpMaskedVer13
                   return OFOxmArpOpMaskedVer13.READER.readFrom(bb);
               case (int) 0x80003006:
                   // discriminator value 0x80003006L=0x80003006L for class OFOxmArpShaVer13
                   return OFOxmArpShaVer13.READER.readFrom(bb);
               case (int) 0x8000310c:
                   // discriminator value 0x8000310cL=0x8000310cL for class OFOxmArpShaMaskedVer13
                   return OFOxmArpShaMaskedVer13.READER.readFrom(bb);
               case (int) 0x80002c04:
                   // discriminator value 0x80002c04L=0x80002c04L for class OFOxmArpSpaVer13
                   return OFOxmArpSpaVer13.READER.readFrom(bb);
               case (int) 0x80002d08:
                   // discriminator value 0x80002d08L=0x80002d08L for class OFOxmArpSpaMaskedVer13
                   return OFOxmArpSpaMaskedVer13.READER.readFrom(bb);
               case (int) 0x80003206:
                   // discriminator value 0x80003206L=0x80003206L for class OFOxmArpThaVer13
                   return OFOxmArpThaVer13.READER.readFrom(bb);
               case (int) 0x8000330c:
                   // discriminator value 0x8000330cL=0x8000330cL for class OFOxmArpThaMaskedVer13
                   return OFOxmArpThaMaskedVer13.READER.readFrom(bb);
               case (int) 0x80002e04:
                   // discriminator value 0x80002e04L=0x80002e04L for class OFOxmArpTpaVer13
                   return OFOxmArpTpaVer13.READER.readFrom(bb);
               case (int) 0x80002f08:
                   // discriminator value 0x80002f08L=0x80002f08L for class OFOxmArpTpaMaskedVer13
                   return OFOxmArpTpaMaskedVer13.READER.readFrom(bb);
               case 0x30e04:
                   // discriminator value 0x30e04L=0x30e04L for class OFOxmBsnEgrPortGroupIdVer13
                   return OFOxmBsnEgrPortGroupIdVer13.READER.readFrom(bb);
               case 0x30f08:
                   // discriminator value 0x30f08L=0x30f08L for class OFOxmBsnEgrPortGroupIdMaskedVer13
                   return OFOxmBsnEgrPortGroupIdMaskedVer13.READER.readFrom(bb);
               case 0x30601:
                   // discriminator value 0x30601L=0x30601L for class OFOxmBsnGlobalVrfAllowedVer13
                   return OFOxmBsnGlobalVrfAllowedVer13.READER.readFrom(bb);
               case 0x30702:
                   // discriminator value 0x30702L=0x30702L for class OFOxmBsnGlobalVrfAllowedMaskedVer13
                   return OFOxmBsnGlobalVrfAllowedMaskedVer13.READER.readFrom(bb);
               case 0x30010:
                   // discriminator value 0x30010L=0x30010L for class OFOxmBsnInPorts128Ver13
                   return OFOxmBsnInPorts128Ver13.READER.readFrom(bb);
               case 0x30120:
                   // discriminator value 0x30120L=0x30120L for class OFOxmBsnInPorts128MaskedVer13
                   return OFOxmBsnInPorts128MaskedVer13.READER.readFrom(bb);
               case 0x32401:
                   // discriminator value 0x32401L=0x32401L for class OFOxmBsnL2CacheHitVer13
                   return OFOxmBsnL2CacheHitVer13.READER.readFrom(bb);
               case 0x32502:
                   // discriminator value 0x32502L=0x32502L for class OFOxmBsnL2CacheHitMaskedVer13
                   return OFOxmBsnL2CacheHitMaskedVer13.READER.readFrom(bb);
               case 0x30c04:
                   // discriminator value 0x30c04L=0x30c04L for class OFOxmBsnL3DstClassIdVer13
                   return OFOxmBsnL3DstClassIdVer13.READER.readFrom(bb);
               case 0x30d08:
                   // discriminator value 0x30d08L=0x30d08L for class OFOxmBsnL3DstClassIdMaskedVer13
                   return OFOxmBsnL3DstClassIdMaskedVer13.READER.readFrom(bb);
               case 0x30804:
                   // discriminator value 0x30804L=0x30804L for class OFOxmBsnL3InterfaceClassIdVer13
                   return OFOxmBsnL3InterfaceClassIdVer13.READER.readFrom(bb);
               case 0x30908:
                   // discriminator value 0x30908L=0x30908L for class OFOxmBsnL3InterfaceClassIdMaskedVer13
                   return OFOxmBsnL3InterfaceClassIdMaskedVer13.READER.readFrom(bb);
               case 0x30a04:
                   // discriminator value 0x30a04L=0x30a04L for class OFOxmBsnL3SrcClassIdVer13
                   return OFOxmBsnL3SrcClassIdVer13.READER.readFrom(bb);
               case 0x30b08:
                   // discriminator value 0x30b08L=0x30b08L for class OFOxmBsnL3SrcClassIdMaskedVer13
                   return OFOxmBsnL3SrcClassIdMaskedVer13.READER.readFrom(bb);
               case 0x30204:
                   // discriminator value 0x30204L=0x30204L for class OFOxmBsnLagIdVer13
                   return OFOxmBsnLagIdVer13.READER.readFrom(bb);
               case 0x30308:
                   // discriminator value 0x30308L=0x30308L for class OFOxmBsnLagIdMaskedVer13
                   return OFOxmBsnLagIdMaskedVer13.READER.readFrom(bb);
               case 0x32002:
                   // discriminator value 0x32002L=0x32002L for class OFOxmBsnTcpFlagsVer13
                   return OFOxmBsnTcpFlagsVer13.READER.readFrom(bb);
               case 0x32104:
                   // discriminator value 0x32104L=0x32104L for class OFOxmBsnTcpFlagsMaskedVer13
                   return OFOxmBsnTcpFlagsMaskedVer13.READER.readFrom(bb);
               case 0x31004:
                   // discriminator value 0x31004L=0x31004L for class OFOxmBsnUdf0Ver13
                   return OFOxmBsnUdf0Ver13.READER.readFrom(bb);
               case 0x31108:
                   // discriminator value 0x31108L=0x31108L for class OFOxmBsnUdf0MaskedVer13
                   return OFOxmBsnUdf0MaskedVer13.READER.readFrom(bb);
               case 0x31204:
                   // discriminator value 0x31204L=0x31204L for class OFOxmBsnUdf1Ver13
                   return OFOxmBsnUdf1Ver13.READER.readFrom(bb);
               case 0x31308:
                   // discriminator value 0x31308L=0x31308L for class OFOxmBsnUdf1MaskedVer13
                   return OFOxmBsnUdf1MaskedVer13.READER.readFrom(bb);
               case 0x31404:
                   // discriminator value 0x31404L=0x31404L for class OFOxmBsnUdf2Ver13
                   return OFOxmBsnUdf2Ver13.READER.readFrom(bb);
               case 0x31508:
                   // discriminator value 0x31508L=0x31508L for class OFOxmBsnUdf2MaskedVer13
                   return OFOxmBsnUdf2MaskedVer13.READER.readFrom(bb);
               case 0x31604:
                   // discriminator value 0x31604L=0x31604L for class OFOxmBsnUdf3Ver13
                   return OFOxmBsnUdf3Ver13.READER.readFrom(bb);
               case 0x31708:
                   // discriminator value 0x31708L=0x31708L for class OFOxmBsnUdf3MaskedVer13
                   return OFOxmBsnUdf3MaskedVer13.READER.readFrom(bb);
               case 0x31804:
                   // discriminator value 0x31804L=0x31804L for class OFOxmBsnUdf4Ver13
                   return OFOxmBsnUdf4Ver13.READER.readFrom(bb);
               case 0x31908:
                   // discriminator value 0x31908L=0x31908L for class OFOxmBsnUdf4MaskedVer13
                   return OFOxmBsnUdf4MaskedVer13.READER.readFrom(bb);
               case 0x31a04:
                   // discriminator value 0x31a04L=0x31a04L for class OFOxmBsnUdf5Ver13
                   return OFOxmBsnUdf5Ver13.READER.readFrom(bb);
               case 0x31b08:
                   // discriminator value 0x31b08L=0x31b08L for class OFOxmBsnUdf5MaskedVer13
                   return OFOxmBsnUdf5MaskedVer13.READER.readFrom(bb);
               case 0x31c04:
                   // discriminator value 0x31c04L=0x31c04L for class OFOxmBsnUdf6Ver13
                   return OFOxmBsnUdf6Ver13.READER.readFrom(bb);
               case 0x31d08:
                   // discriminator value 0x31d08L=0x31d08L for class OFOxmBsnUdf6MaskedVer13
                   return OFOxmBsnUdf6MaskedVer13.READER.readFrom(bb);
               case 0x31e04:
                   // discriminator value 0x31e04L=0x31e04L for class OFOxmBsnUdf7Ver13
                   return OFOxmBsnUdf7Ver13.READER.readFrom(bb);
               case 0x31f08:
                   // discriminator value 0x31f08L=0x31f08L for class OFOxmBsnUdf7MaskedVer13
                   return OFOxmBsnUdf7MaskedVer13.READER.readFrom(bb);
               case 0x32204:
                   // discriminator value 0x32204L=0x32204L for class OFOxmBsnVlanXlatePortGroupIdVer13
                   return OFOxmBsnVlanXlatePortGroupIdVer13.READER.readFrom(bb);
               case 0x32308:
                   // discriminator value 0x32308L=0x32308L for class OFOxmBsnVlanXlatePortGroupIdMaskedVer13
                   return OFOxmBsnVlanXlatePortGroupIdMaskedVer13.READER.readFrom(bb);
               case 0x30404:
                   // discriminator value 0x30404L=0x30404L for class OFOxmBsnVrfVer13
                   return OFOxmBsnVrfVer13.READER.readFrom(bb);
               case 0x30508:
                   // discriminator value 0x30508L=0x30508L for class OFOxmBsnVrfMaskedVer13
                   return OFOxmBsnVrfMaskedVer13.READER.readFrom(bb);
               case (int) 0x80000606:
                   // discriminator value 0x80000606L=0x80000606L for class OFOxmEthDstVer13
                   return OFOxmEthDstVer13.READER.readFrom(bb);
               case (int) 0x8000070c:
                   // discriminator value 0x8000070cL=0x8000070cL for class OFOxmEthDstMaskedVer13
                   return OFOxmEthDstMaskedVer13.READER.readFrom(bb);
               case (int) 0x80000806:
                   // discriminator value 0x80000806L=0x80000806L for class OFOxmEthSrcVer13
                   return OFOxmEthSrcVer13.READER.readFrom(bb);
               case (int) 0x8000090c:
                   // discriminator value 0x8000090cL=0x8000090cL for class OFOxmEthSrcMaskedVer13
                   return OFOxmEthSrcMaskedVer13.READER.readFrom(bb);
               case (int) 0x80000a02:
                   // discriminator value 0x80000a02L=0x80000a02L for class OFOxmEthTypeVer13
                   return OFOxmEthTypeVer13.READER.readFrom(bb);
               case (int) 0x80000b04:
                   // discriminator value 0x80000b04L=0x80000b04L for class OFOxmEthTypeMaskedVer13
                   return OFOxmEthTypeMaskedVer13.READER.readFrom(bb);
               case (int) 0x80002801:
                   // discriminator value 0x80002801L=0x80002801L for class OFOxmIcmpv4CodeVer13
                   return OFOxmIcmpv4CodeVer13.READER.readFrom(bb);
               case (int) 0x80002902:
                   // discriminator value 0x80002902L=0x80002902L for class OFOxmIcmpv4CodeMaskedVer13
                   return OFOxmIcmpv4CodeMaskedVer13.READER.readFrom(bb);
               case (int) 0x80002601:
                   // discriminator value 0x80002601L=0x80002601L for class OFOxmIcmpv4TypeVer13
                   return OFOxmIcmpv4TypeVer13.READER.readFrom(bb);
               case (int) 0x80002702:
                   // discriminator value 0x80002702L=0x80002702L for class OFOxmIcmpv4TypeMaskedVer13
                   return OFOxmIcmpv4TypeMaskedVer13.READER.readFrom(bb);
               case (int) 0x80003c01:
                   // discriminator value 0x80003c01L=0x80003c01L for class OFOxmIcmpv6CodeVer13
                   return OFOxmIcmpv6CodeVer13.READER.readFrom(bb);
               case (int) 0x80003d02:
                   // discriminator value 0x80003d02L=0x80003d02L for class OFOxmIcmpv6CodeMaskedVer13
                   return OFOxmIcmpv6CodeMaskedVer13.READER.readFrom(bb);
               case (int) 0x80003a01:
                   // discriminator value 0x80003a01L=0x80003a01L for class OFOxmIcmpv6TypeVer13
                   return OFOxmIcmpv6TypeVer13.READER.readFrom(bb);
               case (int) 0x80003b02:
                   // discriminator value 0x80003b02L=0x80003b02L for class OFOxmIcmpv6TypeMaskedVer13
                   return OFOxmIcmpv6TypeMaskedVer13.READER.readFrom(bb);
               case (int) 0x80000204:
                   // discriminator value 0x80000204L=0x80000204L for class OFOxmInPhyPortVer13
                   return OFOxmInPhyPortVer13.READER.readFrom(bb);
               case (int) 0x80000308:
                   // discriminator value 0x80000308L=0x80000308L for class OFOxmInPhyPortMaskedVer13
                   return OFOxmInPhyPortMaskedVer13.READER.readFrom(bb);
               case (int) 0x80000004:
                   // discriminator value 0x80000004L=0x80000004L for class OFOxmInPortVer13
                   return OFOxmInPortVer13.READER.readFrom(bb);
               case (int) 0x80000108:
                   // discriminator value 0x80000108L=0x80000108L for class OFOxmInPortMaskedVer13
                   return OFOxmInPortMaskedVer13.READER.readFrom(bb);
               case (int) 0x80001001:
                   // discriminator value 0x80001001L=0x80001001L for class OFOxmIpDscpVer13
                   return OFOxmIpDscpVer13.READER.readFrom(bb);
               case (int) 0x80001102:
                   // discriminator value 0x80001102L=0x80001102L for class OFOxmIpDscpMaskedVer13
                   return OFOxmIpDscpMaskedVer13.READER.readFrom(bb);
               case (int) 0x80001201:
                   // discriminator value 0x80001201L=0x80001201L for class OFOxmIpEcnVer13
                   return OFOxmIpEcnVer13.READER.readFrom(bb);
               case (int) 0x80001302:
                   // discriminator value 0x80001302L=0x80001302L for class OFOxmIpEcnMaskedVer13
                   return OFOxmIpEcnMaskedVer13.READER.readFrom(bb);
               case (int) 0x80001401:
                   // discriminator value 0x80001401L=0x80001401L for class OFOxmIpProtoVer13
                   return OFOxmIpProtoVer13.READER.readFrom(bb);
               case (int) 0x80001502:
                   // discriminator value 0x80001502L=0x80001502L for class OFOxmIpProtoMaskedVer13
                   return OFOxmIpProtoMaskedVer13.READER.readFrom(bb);
               case (int) 0x80001804:
                   // discriminator value 0x80001804L=0x80001804L for class OFOxmIpv4DstVer13
                   return OFOxmIpv4DstVer13.READER.readFrom(bb);
               case (int) 0x80001908:
                   // discriminator value 0x80001908L=0x80001908L for class OFOxmIpv4DstMaskedVer13
                   return OFOxmIpv4DstMaskedVer13.READER.readFrom(bb);
               case (int) 0x80001604:
                   // discriminator value 0x80001604L=0x80001604L for class OFOxmIpv4SrcVer13
                   return OFOxmIpv4SrcVer13.READER.readFrom(bb);
               case (int) 0x80001708:
                   // discriminator value 0x80001708L=0x80001708L for class OFOxmIpv4SrcMaskedVer13
                   return OFOxmIpv4SrcMaskedVer13.READER.readFrom(bb);
               case (int) 0x80003610:
                   // discriminator value 0x80003610L=0x80003610L for class OFOxmIpv6DstVer13
                   return OFOxmIpv6DstVer13.READER.readFrom(bb);
               case (int) 0x80003720:
                   // discriminator value 0x80003720L=0x80003720L for class OFOxmIpv6DstMaskedVer13
                   return OFOxmIpv6DstMaskedVer13.READER.readFrom(bb);
               case (int) 0x80003804:
                   // discriminator value 0x80003804L=0x80003804L for class OFOxmIpv6FlabelVer13
                   return OFOxmIpv6FlabelVer13.READER.readFrom(bb);
               case (int) 0x80003908:
                   // discriminator value 0x80003908L=0x80003908L for class OFOxmIpv6FlabelMaskedVer13
                   return OFOxmIpv6FlabelMaskedVer13.READER.readFrom(bb);
               case (int) 0x80004006:
                   // discriminator value 0x80004006L=0x80004006L for class OFOxmIpv6NdSllVer13
                   return OFOxmIpv6NdSllVer13.READER.readFrom(bb);
               case (int) 0x8000410c:
                   // discriminator value 0x8000410cL=0x8000410cL for class OFOxmIpv6NdSllMaskedVer13
                   return OFOxmIpv6NdSllMaskedVer13.READER.readFrom(bb);
               case (int) 0x80003e10:
                   // discriminator value 0x80003e10L=0x80003e10L for class OFOxmIpv6NdTargetVer13
                   return OFOxmIpv6NdTargetVer13.READER.readFrom(bb);
               case (int) 0x80003f20:
                   // discriminator value 0x80003f20L=0x80003f20L for class OFOxmIpv6NdTargetMaskedVer13
                   return OFOxmIpv6NdTargetMaskedVer13.READER.readFrom(bb);
               case (int) 0x80004206:
                   // discriminator value 0x80004206L=0x80004206L for class OFOxmIpv6NdTllVer13
                   return OFOxmIpv6NdTllVer13.READER.readFrom(bb);
               case (int) 0x8000430c:
                   // discriminator value 0x8000430cL=0x8000430cL for class OFOxmIpv6NdTllMaskedVer13
                   return OFOxmIpv6NdTllMaskedVer13.READER.readFrom(bb);
               case (int) 0x80003410:
                   // discriminator value 0x80003410L=0x80003410L for class OFOxmIpv6SrcVer13
                   return OFOxmIpv6SrcVer13.READER.readFrom(bb);
               case (int) 0x80003520:
                   // discriminator value 0x80003520L=0x80003520L for class OFOxmIpv6SrcMaskedVer13
                   return OFOxmIpv6SrcMaskedVer13.READER.readFrom(bb);
               case (int) 0x80000408:
                   // discriminator value 0x80000408L=0x80000408L for class OFOxmMetadataVer13
                   return OFOxmMetadataVer13.READER.readFrom(bb);
               case (int) 0x80000510:
                   // discriminator value 0x80000510L=0x80000510L for class OFOxmMetadataMaskedVer13
                   return OFOxmMetadataMaskedVer13.READER.readFrom(bb);
               case (int) 0x80004404:
                   // discriminator value 0x80004404L=0x80004404L for class OFOxmMplsLabelVer13
                   return OFOxmMplsLabelVer13.READER.readFrom(bb);
               case (int) 0x80004508:
                   // discriminator value 0x80004508L=0x80004508L for class OFOxmMplsLabelMaskedVer13
                   return OFOxmMplsLabelMaskedVer13.READER.readFrom(bb);
               case (int) 0x80004601:
                   // discriminator value 0x80004601L=0x80004601L for class OFOxmMplsTcVer13
                   return OFOxmMplsTcVer13.READER.readFrom(bb);
               case (int) 0x80004702:
                   // discriminator value 0x80004702L=0x80004702L for class OFOxmMplsTcMaskedVer13
                   return OFOxmMplsTcMaskedVer13.READER.readFrom(bb);
               case (int) 0x80002402:
                   // discriminator value 0x80002402L=0x80002402L for class OFOxmSctpDstVer13
                   return OFOxmSctpDstVer13.READER.readFrom(bb);
               case (int) 0x80002504:
                   // discriminator value 0x80002504L=0x80002504L for class OFOxmSctpDstMaskedVer13
                   return OFOxmSctpDstMaskedVer13.READER.readFrom(bb);
               case (int) 0x80002202:
                   // discriminator value 0x80002202L=0x80002202L for class OFOxmSctpSrcVer13
                   return OFOxmSctpSrcVer13.READER.readFrom(bb);
               case (int) 0x80002304:
                   // discriminator value 0x80002304L=0x80002304L for class OFOxmSctpSrcMaskedVer13
                   return OFOxmSctpSrcMaskedVer13.READER.readFrom(bb);
               case (int) 0x80001c02:
                   // discriminator value 0x80001c02L=0x80001c02L for class OFOxmTcpDstVer13
                   return OFOxmTcpDstVer13.READER.readFrom(bb);
               case (int) 0x80001d04:
                   // discriminator value 0x80001d04L=0x80001d04L for class OFOxmTcpDstMaskedVer13
                   return OFOxmTcpDstMaskedVer13.READER.readFrom(bb);
               case (int) 0x80001a02:
                   // discriminator value 0x80001a02L=0x80001a02L for class OFOxmTcpSrcVer13
                   return OFOxmTcpSrcVer13.READER.readFrom(bb);
               case (int) 0x80001b04:
                   // discriminator value 0x80001b04L=0x80001b04L for class OFOxmTcpSrcMaskedVer13
                   return OFOxmTcpSrcMaskedVer13.READER.readFrom(bb);
               case 0x14004:
                   // discriminator value 0x14004L=0x14004L for class OFOxmTunnelIpv4DstVer13
                   return OFOxmTunnelIpv4DstVer13.READER.readFrom(bb);
               case 0x14108:
                   // discriminator value 0x14108L=0x14108L for class OFOxmTunnelIpv4DstMaskedVer13
                   return OFOxmTunnelIpv4DstMaskedVer13.READER.readFrom(bb);
               case 0x13e04:
                   // discriminator value 0x13e04L=0x13e04L for class OFOxmTunnelIpv4SrcVer13
                   return OFOxmTunnelIpv4SrcVer13.READER.readFrom(bb);
               case 0x13f08:
                   // discriminator value 0x13f08L=0x13f08L for class OFOxmTunnelIpv4SrcMaskedVer13
                   return OFOxmTunnelIpv4SrcMaskedVer13.READER.readFrom(bb);
               case (int) 0x80002002:
                   // discriminator value 0x80002002L=0x80002002L for class OFOxmUdpDstVer13
                   return OFOxmUdpDstVer13.READER.readFrom(bb);
               case (int) 0x80002104:
                   // discriminator value 0x80002104L=0x80002104L for class OFOxmUdpDstMaskedVer13
                   return OFOxmUdpDstMaskedVer13.READER.readFrom(bb);
               case (int) 0x80001e02:
                   // discriminator value 0x80001e02L=0x80001e02L for class OFOxmUdpSrcVer13
                   return OFOxmUdpSrcVer13.READER.readFrom(bb);
               case (int) 0x80001f04:
                   // discriminator value 0x80001f04L=0x80001f04L for class OFOxmUdpSrcMaskedVer13
                   return OFOxmUdpSrcMaskedVer13.READER.readFrom(bb);
               case (int) 0x80000e01:
                   // discriminator value 0x80000e01L=0x80000e01L for class OFOxmVlanPcpVer13
                   return OFOxmVlanPcpVer13.READER.readFrom(bb);
               case (int) 0x80000f02:
                   // discriminator value 0x80000f02L=0x80000f02L for class OFOxmVlanPcpMaskedVer13
                   return OFOxmVlanPcpMaskedVer13.READER.readFrom(bb);
               case (int) 0x80000c02:
                   // discriminator value 0x80000c02L=0x80000c02L for class OFOxmVlanVidVer13
                   return OFOxmVlanVidVer13.READER.readFrom(bb);
               case (int) 0x80000d04:
                   // discriminator value 0x80000d04L=0x80000d04L for class OFOxmVlanVidMaskedVer13
                   return OFOxmVlanVidMaskedVer13.READER.readFrom(bb);
               case (int) 0x80004e02:
                   // discriminator value 0x80004e02L=0x80004e02L for class OFOxmIpv6ExthdrVer13
                   return OFOxmIpv6ExthdrVer13.READER.readFrom(bb);
               case (int) 0x80004f04:
                   // discriminator value 0x80004f04L=0x80004f04L for class OFOxmIpv6ExthdrMaskedVer13
                   return OFOxmIpv6ExthdrMaskedVer13.READER.readFrom(bb);
               case (int) 0x80004801:
                   // discriminator value 0x80004801L=0x80004801L for class OFOxmMplsBosVer13
                   return OFOxmMplsBosVer13.READER.readFrom(bb);
               case (int) 0x80004902:
                   // discriminator value 0x80004902L=0x80004902L for class OFOxmMplsBosMaskedVer13
                   return OFOxmMplsBosMaskedVer13.READER.readFrom(bb);
               case (int) 0x80004c08:
                   // discriminator value 0x80004c08L=0x80004c08L for class OFOxmTunnelIdVer13
                   return OFOxmTunnelIdVer13.READER.readFrom(bb);
               case (int) 0x80004d10:
                   // discriminator value 0x80004d10L=0x80004d10L for class OFOxmTunnelIdMaskedVer13
                   return OFOxmTunnelIdMaskedVer13.READER.readFrom(bb);
               /* -------------------------- Fujitsu code start -------------------------- */
               /* Add Optical(OTN) parameters */
               case (int) 0xffff0401:
                   // discriminator value 0xffff0401L=0xffff0401L for class OFOxmOduSigtypeVer13
                   return OFOxmOduSigtypeVer13.READER.readFrom(bb);
               case (int) 0xffff0605:
                   // discriminator value 0xffff0605L=0xffff0605L for class OFOxmOduSigidVer13
                   return OFOxmOduSigidVer13.READER.readFrom(bb);
               /* -------------------------- Fujitsu code end ---------------------------- */
               default:
                   throw new OFParseError("Unknown value for discriminator typeLen of class OFOxmVer13: " + typeLen);
            }
        }
    }
}
