// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
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
import org.jboss.netty.buffer.ChannelBuffer;

abstract class OFOxmVer12 {
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int MINIMUM_LENGTH = 4;


    public final static OFOxmVer12.Reader READER = new Reader();

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
                   // discriminator value 0x80002a02L=0x80002a02L for class OFOxmArpOpVer12
                   return OFOxmArpOpVer12.READER.readFrom(bb);
               case (int) 0x80002b04:
                   // discriminator value 0x80002b04L=0x80002b04L for class OFOxmArpOpMaskedVer12
                   return OFOxmArpOpMaskedVer12.READER.readFrom(bb);
               case (int) 0x80003006:
                   // discriminator value 0x80003006L=0x80003006L for class OFOxmArpShaVer12
                   return OFOxmArpShaVer12.READER.readFrom(bb);
               case (int) 0x8000310c:
                   // discriminator value 0x8000310cL=0x8000310cL for class OFOxmArpShaMaskedVer12
                   return OFOxmArpShaMaskedVer12.READER.readFrom(bb);
               case (int) 0x80002c04:
                   // discriminator value 0x80002c04L=0x80002c04L for class OFOxmArpSpaVer12
                   return OFOxmArpSpaVer12.READER.readFrom(bb);
               case (int) 0x80002d08:
                   // discriminator value 0x80002d08L=0x80002d08L for class OFOxmArpSpaMaskedVer12
                   return OFOxmArpSpaMaskedVer12.READER.readFrom(bb);
               case (int) 0x80003206:
                   // discriminator value 0x80003206L=0x80003206L for class OFOxmArpThaVer12
                   return OFOxmArpThaVer12.READER.readFrom(bb);
               case (int) 0x8000330c:
                   // discriminator value 0x8000330cL=0x8000330cL for class OFOxmArpThaMaskedVer12
                   return OFOxmArpThaMaskedVer12.READER.readFrom(bb);
               case (int) 0x80002e04:
                   // discriminator value 0x80002e04L=0x80002e04L for class OFOxmArpTpaVer12
                   return OFOxmArpTpaVer12.READER.readFrom(bb);
               case (int) 0x80002f08:
                   // discriminator value 0x80002f08L=0x80002f08L for class OFOxmArpTpaMaskedVer12
                   return OFOxmArpTpaMaskedVer12.READER.readFrom(bb);
               case 0x30e04:
                   // discriminator value 0x30e04L=0x30e04L for class OFOxmBsnEgrPortGroupIdVer12
                   return OFOxmBsnEgrPortGroupIdVer12.READER.readFrom(bb);
               case 0x30f08:
                   // discriminator value 0x30f08L=0x30f08L for class OFOxmBsnEgrPortGroupIdMaskedVer12
                   return OFOxmBsnEgrPortGroupIdMaskedVer12.READER.readFrom(bb);
               case 0x30601:
                   // discriminator value 0x30601L=0x30601L for class OFOxmBsnGlobalVrfAllowedVer12
                   return OFOxmBsnGlobalVrfAllowedVer12.READER.readFrom(bb);
               case 0x30702:
                   // discriminator value 0x30702L=0x30702L for class OFOxmBsnGlobalVrfAllowedMaskedVer12
                   return OFOxmBsnGlobalVrfAllowedMaskedVer12.READER.readFrom(bb);
               case 0x30010:
                   // discriminator value 0x30010L=0x30010L for class OFOxmBsnInPorts128Ver12
                   return OFOxmBsnInPorts128Ver12.READER.readFrom(bb);
               case 0x30120:
                   // discriminator value 0x30120L=0x30120L for class OFOxmBsnInPorts128MaskedVer12
                   return OFOxmBsnInPorts128MaskedVer12.READER.readFrom(bb);
               case 0x32401:
                   // discriminator value 0x32401L=0x32401L for class OFOxmBsnL2CacheHitVer12
                   return OFOxmBsnL2CacheHitVer12.READER.readFrom(bb);
               case 0x32502:
                   // discriminator value 0x32502L=0x32502L for class OFOxmBsnL2CacheHitMaskedVer12
                   return OFOxmBsnL2CacheHitMaskedVer12.READER.readFrom(bb);
               case 0x30c04:
                   // discriminator value 0x30c04L=0x30c04L for class OFOxmBsnL3DstClassIdVer12
                   return OFOxmBsnL3DstClassIdVer12.READER.readFrom(bb);
               case 0x30d08:
                   // discriminator value 0x30d08L=0x30d08L for class OFOxmBsnL3DstClassIdMaskedVer12
                   return OFOxmBsnL3DstClassIdMaskedVer12.READER.readFrom(bb);
               case 0x30804:
                   // discriminator value 0x30804L=0x30804L for class OFOxmBsnL3InterfaceClassIdVer12
                   return OFOxmBsnL3InterfaceClassIdVer12.READER.readFrom(bb);
               case 0x30908:
                   // discriminator value 0x30908L=0x30908L for class OFOxmBsnL3InterfaceClassIdMaskedVer12
                   return OFOxmBsnL3InterfaceClassIdMaskedVer12.READER.readFrom(bb);
               case 0x30a04:
                   // discriminator value 0x30a04L=0x30a04L for class OFOxmBsnL3SrcClassIdVer12
                   return OFOxmBsnL3SrcClassIdVer12.READER.readFrom(bb);
               case 0x30b08:
                   // discriminator value 0x30b08L=0x30b08L for class OFOxmBsnL3SrcClassIdMaskedVer12
                   return OFOxmBsnL3SrcClassIdMaskedVer12.READER.readFrom(bb);
               case 0x30204:
                   // discriminator value 0x30204L=0x30204L for class OFOxmBsnLagIdVer12
                   return OFOxmBsnLagIdVer12.READER.readFrom(bb);
               case 0x30308:
                   // discriminator value 0x30308L=0x30308L for class OFOxmBsnLagIdMaskedVer12
                   return OFOxmBsnLagIdMaskedVer12.READER.readFrom(bb);
               case 0x32002:
                   // discriminator value 0x32002L=0x32002L for class OFOxmBsnTcpFlagsVer12
                   return OFOxmBsnTcpFlagsVer12.READER.readFrom(bb);
               case 0x32104:
                   // discriminator value 0x32104L=0x32104L for class OFOxmBsnTcpFlagsMaskedVer12
                   return OFOxmBsnTcpFlagsMaskedVer12.READER.readFrom(bb);
               case 0x31004:
                   // discriminator value 0x31004L=0x31004L for class OFOxmBsnUdf0Ver12
                   return OFOxmBsnUdf0Ver12.READER.readFrom(bb);
               case 0x31108:
                   // discriminator value 0x31108L=0x31108L for class OFOxmBsnUdf0MaskedVer12
                   return OFOxmBsnUdf0MaskedVer12.READER.readFrom(bb);
               case 0x31204:
                   // discriminator value 0x31204L=0x31204L for class OFOxmBsnUdf1Ver12
                   return OFOxmBsnUdf1Ver12.READER.readFrom(bb);
               case 0x31308:
                   // discriminator value 0x31308L=0x31308L for class OFOxmBsnUdf1MaskedVer12
                   return OFOxmBsnUdf1MaskedVer12.READER.readFrom(bb);
               case 0x31404:
                   // discriminator value 0x31404L=0x31404L for class OFOxmBsnUdf2Ver12
                   return OFOxmBsnUdf2Ver12.READER.readFrom(bb);
               case 0x31508:
                   // discriminator value 0x31508L=0x31508L for class OFOxmBsnUdf2MaskedVer12
                   return OFOxmBsnUdf2MaskedVer12.READER.readFrom(bb);
               case 0x31604:
                   // discriminator value 0x31604L=0x31604L for class OFOxmBsnUdf3Ver12
                   return OFOxmBsnUdf3Ver12.READER.readFrom(bb);
               case 0x31708:
                   // discriminator value 0x31708L=0x31708L for class OFOxmBsnUdf3MaskedVer12
                   return OFOxmBsnUdf3MaskedVer12.READER.readFrom(bb);
               case 0x31804:
                   // discriminator value 0x31804L=0x31804L for class OFOxmBsnUdf4Ver12
                   return OFOxmBsnUdf4Ver12.READER.readFrom(bb);
               case 0x31908:
                   // discriminator value 0x31908L=0x31908L for class OFOxmBsnUdf4MaskedVer12
                   return OFOxmBsnUdf4MaskedVer12.READER.readFrom(bb);
               case 0x31a04:
                   // discriminator value 0x31a04L=0x31a04L for class OFOxmBsnUdf5Ver12
                   return OFOxmBsnUdf5Ver12.READER.readFrom(bb);
               case 0x31b08:
                   // discriminator value 0x31b08L=0x31b08L for class OFOxmBsnUdf5MaskedVer12
                   return OFOxmBsnUdf5MaskedVer12.READER.readFrom(bb);
               case 0x31c04:
                   // discriminator value 0x31c04L=0x31c04L for class OFOxmBsnUdf6Ver12
                   return OFOxmBsnUdf6Ver12.READER.readFrom(bb);
               case 0x31d08:
                   // discriminator value 0x31d08L=0x31d08L for class OFOxmBsnUdf6MaskedVer12
                   return OFOxmBsnUdf6MaskedVer12.READER.readFrom(bb);
               case 0x31e04:
                   // discriminator value 0x31e04L=0x31e04L for class OFOxmBsnUdf7Ver12
                   return OFOxmBsnUdf7Ver12.READER.readFrom(bb);
               case 0x31f08:
                   // discriminator value 0x31f08L=0x31f08L for class OFOxmBsnUdf7MaskedVer12
                   return OFOxmBsnUdf7MaskedVer12.READER.readFrom(bb);
               case 0x32204:
                   // discriminator value 0x32204L=0x32204L for class OFOxmBsnVlanXlatePortGroupIdVer12
                   return OFOxmBsnVlanXlatePortGroupIdVer12.READER.readFrom(bb);
               case 0x32308:
                   // discriminator value 0x32308L=0x32308L for class OFOxmBsnVlanXlatePortGroupIdMaskedVer12
                   return OFOxmBsnVlanXlatePortGroupIdMaskedVer12.READER.readFrom(bb);
               case 0x30404:
                   // discriminator value 0x30404L=0x30404L for class OFOxmBsnVrfVer12
                   return OFOxmBsnVrfVer12.READER.readFrom(bb);
               case 0x30508:
                   // discriminator value 0x30508L=0x30508L for class OFOxmBsnVrfMaskedVer12
                   return OFOxmBsnVrfMaskedVer12.READER.readFrom(bb);
               case (int) 0x80000606:
                   // discriminator value 0x80000606L=0x80000606L for class OFOxmEthDstVer12
                   return OFOxmEthDstVer12.READER.readFrom(bb);
               case (int) 0x8000070c:
                   // discriminator value 0x8000070cL=0x8000070cL for class OFOxmEthDstMaskedVer12
                   return OFOxmEthDstMaskedVer12.READER.readFrom(bb);
               case (int) 0x80000806:
                   // discriminator value 0x80000806L=0x80000806L for class OFOxmEthSrcVer12
                   return OFOxmEthSrcVer12.READER.readFrom(bb);
               case (int) 0x8000090c:
                   // discriminator value 0x8000090cL=0x8000090cL for class OFOxmEthSrcMaskedVer12
                   return OFOxmEthSrcMaskedVer12.READER.readFrom(bb);
               case (int) 0x80000a02:
                   // discriminator value 0x80000a02L=0x80000a02L for class OFOxmEthTypeVer12
                   return OFOxmEthTypeVer12.READER.readFrom(bb);
               case (int) 0x80000b04:
                   // discriminator value 0x80000b04L=0x80000b04L for class OFOxmEthTypeMaskedVer12
                   return OFOxmEthTypeMaskedVer12.READER.readFrom(bb);
               case (int) 0x80002801:
                   // discriminator value 0x80002801L=0x80002801L for class OFOxmIcmpv4CodeVer12
                   return OFOxmIcmpv4CodeVer12.READER.readFrom(bb);
               case (int) 0x80002902:
                   // discriminator value 0x80002902L=0x80002902L for class OFOxmIcmpv4CodeMaskedVer12
                   return OFOxmIcmpv4CodeMaskedVer12.READER.readFrom(bb);
               case (int) 0x80002601:
                   // discriminator value 0x80002601L=0x80002601L for class OFOxmIcmpv4TypeVer12
                   return OFOxmIcmpv4TypeVer12.READER.readFrom(bb);
               case (int) 0x80002702:
                   // discriminator value 0x80002702L=0x80002702L for class OFOxmIcmpv4TypeMaskedVer12
                   return OFOxmIcmpv4TypeMaskedVer12.READER.readFrom(bb);
               case (int) 0x80003c01:
                   // discriminator value 0x80003c01L=0x80003c01L for class OFOxmIcmpv6CodeVer12
                   return OFOxmIcmpv6CodeVer12.READER.readFrom(bb);
               case (int) 0x80003d02:
                   // discriminator value 0x80003d02L=0x80003d02L for class OFOxmIcmpv6CodeMaskedVer12
                   return OFOxmIcmpv6CodeMaskedVer12.READER.readFrom(bb);
               case (int) 0x80003a01:
                   // discriminator value 0x80003a01L=0x80003a01L for class OFOxmIcmpv6TypeVer12
                   return OFOxmIcmpv6TypeVer12.READER.readFrom(bb);
               case (int) 0x80003b02:
                   // discriminator value 0x80003b02L=0x80003b02L for class OFOxmIcmpv6TypeMaskedVer12
                   return OFOxmIcmpv6TypeMaskedVer12.READER.readFrom(bb);
               case (int) 0x80000204:
                   // discriminator value 0x80000204L=0x80000204L for class OFOxmInPhyPortVer12
                   return OFOxmInPhyPortVer12.READER.readFrom(bb);
               case (int) 0x80000308:
                   // discriminator value 0x80000308L=0x80000308L for class OFOxmInPhyPortMaskedVer12
                   return OFOxmInPhyPortMaskedVer12.READER.readFrom(bb);
               case (int) 0x80000004:
                   // discriminator value 0x80000004L=0x80000004L for class OFOxmInPortVer12
                   return OFOxmInPortVer12.READER.readFrom(bb);
               case (int) 0x80000108:
                   // discriminator value 0x80000108L=0x80000108L for class OFOxmInPortMaskedVer12
                   return OFOxmInPortMaskedVer12.READER.readFrom(bb);
               case (int) 0x80001001:
                   // discriminator value 0x80001001L=0x80001001L for class OFOxmIpDscpVer12
                   return OFOxmIpDscpVer12.READER.readFrom(bb);
               case (int) 0x80001102:
                   // discriminator value 0x80001102L=0x80001102L for class OFOxmIpDscpMaskedVer12
                   return OFOxmIpDscpMaskedVer12.READER.readFrom(bb);
               case (int) 0x80001201:
                   // discriminator value 0x80001201L=0x80001201L for class OFOxmIpEcnVer12
                   return OFOxmIpEcnVer12.READER.readFrom(bb);
               case (int) 0x80001302:
                   // discriminator value 0x80001302L=0x80001302L for class OFOxmIpEcnMaskedVer12
                   return OFOxmIpEcnMaskedVer12.READER.readFrom(bb);
               case (int) 0x80001401:
                   // discriminator value 0x80001401L=0x80001401L for class OFOxmIpProtoVer12
                   return OFOxmIpProtoVer12.READER.readFrom(bb);
               case (int) 0x80001502:
                   // discriminator value 0x80001502L=0x80001502L for class OFOxmIpProtoMaskedVer12
                   return OFOxmIpProtoMaskedVer12.READER.readFrom(bb);
               case (int) 0x80001804:
                   // discriminator value 0x80001804L=0x80001804L for class OFOxmIpv4DstVer12
                   return OFOxmIpv4DstVer12.READER.readFrom(bb);
               case (int) 0x80001908:
                   // discriminator value 0x80001908L=0x80001908L for class OFOxmIpv4DstMaskedVer12
                   return OFOxmIpv4DstMaskedVer12.READER.readFrom(bb);
               case (int) 0x80001604:
                   // discriminator value 0x80001604L=0x80001604L for class OFOxmIpv4SrcVer12
                   return OFOxmIpv4SrcVer12.READER.readFrom(bb);
               case (int) 0x80001708:
                   // discriminator value 0x80001708L=0x80001708L for class OFOxmIpv4SrcMaskedVer12
                   return OFOxmIpv4SrcMaskedVer12.READER.readFrom(bb);
               case (int) 0x80003610:
                   // discriminator value 0x80003610L=0x80003610L for class OFOxmIpv6DstVer12
                   return OFOxmIpv6DstVer12.READER.readFrom(bb);
               case (int) 0x80003720:
                   // discriminator value 0x80003720L=0x80003720L for class OFOxmIpv6DstMaskedVer12
                   return OFOxmIpv6DstMaskedVer12.READER.readFrom(bb);
               case (int) 0x80003804:
                   // discriminator value 0x80003804L=0x80003804L for class OFOxmIpv6FlabelVer12
                   return OFOxmIpv6FlabelVer12.READER.readFrom(bb);
               case (int) 0x80003908:
                   // discriminator value 0x80003908L=0x80003908L for class OFOxmIpv6FlabelMaskedVer12
                   return OFOxmIpv6FlabelMaskedVer12.READER.readFrom(bb);
               case (int) 0x80004006:
                   // discriminator value 0x80004006L=0x80004006L for class OFOxmIpv6NdSllVer12
                   return OFOxmIpv6NdSllVer12.READER.readFrom(bb);
               case (int) 0x8000410c:
                   // discriminator value 0x8000410cL=0x8000410cL for class OFOxmIpv6NdSllMaskedVer12
                   return OFOxmIpv6NdSllMaskedVer12.READER.readFrom(bb);
               case (int) 0x80003e10:
                   // discriminator value 0x80003e10L=0x80003e10L for class OFOxmIpv6NdTargetVer12
                   return OFOxmIpv6NdTargetVer12.READER.readFrom(bb);
               case (int) 0x80003f20:
                   // discriminator value 0x80003f20L=0x80003f20L for class OFOxmIpv6NdTargetMaskedVer12
                   return OFOxmIpv6NdTargetMaskedVer12.READER.readFrom(bb);
               case (int) 0x80004206:
                   // discriminator value 0x80004206L=0x80004206L for class OFOxmIpv6NdTllVer12
                   return OFOxmIpv6NdTllVer12.READER.readFrom(bb);
               case (int) 0x8000430c:
                   // discriminator value 0x8000430cL=0x8000430cL for class OFOxmIpv6NdTllMaskedVer12
                   return OFOxmIpv6NdTllMaskedVer12.READER.readFrom(bb);
               case (int) 0x80003410:
                   // discriminator value 0x80003410L=0x80003410L for class OFOxmIpv6SrcVer12
                   return OFOxmIpv6SrcVer12.READER.readFrom(bb);
               case (int) 0x80003520:
                   // discriminator value 0x80003520L=0x80003520L for class OFOxmIpv6SrcMaskedVer12
                   return OFOxmIpv6SrcMaskedVer12.READER.readFrom(bb);
               case (int) 0x80000408:
                   // discriminator value 0x80000408L=0x80000408L for class OFOxmMetadataVer12
                   return OFOxmMetadataVer12.READER.readFrom(bb);
               case (int) 0x80000510:
                   // discriminator value 0x80000510L=0x80000510L for class OFOxmMetadataMaskedVer12
                   return OFOxmMetadataMaskedVer12.READER.readFrom(bb);
               case (int) 0x80004404:
                   // discriminator value 0x80004404L=0x80004404L for class OFOxmMplsLabelVer12
                   return OFOxmMplsLabelVer12.READER.readFrom(bb);
               case (int) 0x80004508:
                   // discriminator value 0x80004508L=0x80004508L for class OFOxmMplsLabelMaskedVer12
                   return OFOxmMplsLabelMaskedVer12.READER.readFrom(bb);
               case (int) 0x80004601:
                   // discriminator value 0x80004601L=0x80004601L for class OFOxmMplsTcVer12
                   return OFOxmMplsTcVer12.READER.readFrom(bb);
               case (int) 0x80004702:
                   // discriminator value 0x80004702L=0x80004702L for class OFOxmMplsTcMaskedVer12
                   return OFOxmMplsTcMaskedVer12.READER.readFrom(bb);
               case (int) 0x80002402:
                   // discriminator value 0x80002402L=0x80002402L for class OFOxmSctpDstVer12
                   return OFOxmSctpDstVer12.READER.readFrom(bb);
               case (int) 0x80002504:
                   // discriminator value 0x80002504L=0x80002504L for class OFOxmSctpDstMaskedVer12
                   return OFOxmSctpDstMaskedVer12.READER.readFrom(bb);
               case (int) 0x80002202:
                   // discriminator value 0x80002202L=0x80002202L for class OFOxmSctpSrcVer12
                   return OFOxmSctpSrcVer12.READER.readFrom(bb);
               case (int) 0x80002304:
                   // discriminator value 0x80002304L=0x80002304L for class OFOxmSctpSrcMaskedVer12
                   return OFOxmSctpSrcMaskedVer12.READER.readFrom(bb);
               case (int) 0x80001c02:
                   // discriminator value 0x80001c02L=0x80001c02L for class OFOxmTcpDstVer12
                   return OFOxmTcpDstVer12.READER.readFrom(bb);
               case (int) 0x80001d04:
                   // discriminator value 0x80001d04L=0x80001d04L for class OFOxmTcpDstMaskedVer12
                   return OFOxmTcpDstMaskedVer12.READER.readFrom(bb);
               case (int) 0x80001a02:
                   // discriminator value 0x80001a02L=0x80001a02L for class OFOxmTcpSrcVer12
                   return OFOxmTcpSrcVer12.READER.readFrom(bb);
               case (int) 0x80001b04:
                   // discriminator value 0x80001b04L=0x80001b04L for class OFOxmTcpSrcMaskedVer12
                   return OFOxmTcpSrcMaskedVer12.READER.readFrom(bb);
               case 0x14004:
                   // discriminator value 0x14004L=0x14004L for class OFOxmTunnelIpv4DstVer12
                   return OFOxmTunnelIpv4DstVer12.READER.readFrom(bb);
               case 0x14108:
                   // discriminator value 0x14108L=0x14108L for class OFOxmTunnelIpv4DstMaskedVer12
                   return OFOxmTunnelIpv4DstMaskedVer12.READER.readFrom(bb);
               case 0x13e04:
                   // discriminator value 0x13e04L=0x13e04L for class OFOxmTunnelIpv4SrcVer12
                   return OFOxmTunnelIpv4SrcVer12.READER.readFrom(bb);
               case 0x13f08:
                   // discriminator value 0x13f08L=0x13f08L for class OFOxmTunnelIpv4SrcMaskedVer12
                   return OFOxmTunnelIpv4SrcMaskedVer12.READER.readFrom(bb);
               case (int) 0x80002002:
                   // discriminator value 0x80002002L=0x80002002L for class OFOxmUdpDstVer12
                   return OFOxmUdpDstVer12.READER.readFrom(bb);
               case (int) 0x80002104:
                   // discriminator value 0x80002104L=0x80002104L for class OFOxmUdpDstMaskedVer12
                   return OFOxmUdpDstMaskedVer12.READER.readFrom(bb);
               case (int) 0x80001e02:
                   // discriminator value 0x80001e02L=0x80001e02L for class OFOxmUdpSrcVer12
                   return OFOxmUdpSrcVer12.READER.readFrom(bb);
               case (int) 0x80001f04:
                   // discriminator value 0x80001f04L=0x80001f04L for class OFOxmUdpSrcMaskedVer12
                   return OFOxmUdpSrcMaskedVer12.READER.readFrom(bb);
               case (int) 0x80000e01:
                   // discriminator value 0x80000e01L=0x80000e01L for class OFOxmVlanPcpVer12
                   return OFOxmVlanPcpVer12.READER.readFrom(bb);
               case (int) 0x80000f02:
                   // discriminator value 0x80000f02L=0x80000f02L for class OFOxmVlanPcpMaskedVer12
                   return OFOxmVlanPcpMaskedVer12.READER.readFrom(bb);
               case (int) 0x80000c02:
                   // discriminator value 0x80000c02L=0x80000c02L for class OFOxmVlanVidVer12
                   return OFOxmVlanVidVer12.READER.readFrom(bb);
               case (int) 0x80000d04:
                   // discriminator value 0x80000d04L=0x80000d04L for class OFOxmVlanVidMaskedVer12
                   return OFOxmVlanVidMaskedVer12.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator typeLen of class OFOxmVer12: " + typeLen);
            }
        }
    }
}
