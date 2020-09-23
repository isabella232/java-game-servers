/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1/game_server_deployments.proto

package com.google.cloud.gaming.v1;

public final class GameServerDeployments {
  private GameServerDeployments() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRolloutRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRolloutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_DeleteGameServerDeploymentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_DeleteGameServerDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRolloutRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRolloutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_FetchDeploymentStateRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_FetchDeploymentStateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_DeployedClusterState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_DeployedClusterState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GameServerDeployment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GameServerDeployment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GameServerDeployment_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GameServerDeployment_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GameServerConfigOverride_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GameServerConfigOverride_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GameServerDeploymentRollout_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GameServerDeploymentRollout_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/gaming/v1/game_server_dep"
          + "loyments.proto\022\026google.cloud.gaming.v1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032#google/cloud/gaming/"
          + "v1/common.proto\032 google/protobuf/field_m"
          + "ask.proto\032\037google/protobuf/timestamp.pro"
          + "to\032\034google/api/annotations.proto\"\311\001\n Lis"
          + "tGameServerDeploymentsRequest\022H\n\006parent\030"
          + "\001 \001(\tB8\340A\002\372A2\0220gameservices.googleapis.c"
          + "om/GameServerDeployment\022\026\n\tpage_size\030\002 \001"
          + "(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\022\023\n\006filt"
          + "er\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030\005 \001(\tB\003\340A\001\"\240\001\n"
          + "!ListGameServerDeploymentsResponse\022M\n\027ga"
          + "me_server_deployments\030\001 \003(\0132,.google.clo"
          + "ud.gaming.v1.GameServerDeployment\022\027\n\017nex"
          + "t_page_token\030\002 \001(\t\022\023\n\013unreachable\030\004 \003(\t\""
          + "h\n\036GetGameServerDeploymentRequest\022F\n\004nam"
          + "e\030\001 \001(\tB8\340A\002\372A2\n0gameservices.googleapis"
          + ".com/GameServerDeployment\"o\n%GetGameServ"
          + "erDeploymentRolloutRequest\022F\n\004name\030\001 \001(\t"
          + "B8\340A\002\372A2\n0gameservices.googleapis.com/Ga"
          + "meServerDeployment\"\334\001\n!CreateGameServerD"
          + "eploymentRequest\022H\n\006parent\030\001 \001(\tB8\340A\002\372A2"
          + "\0220gameservices.googleapis.com/GameServer"
          + "Deployment\022\032\n\rdeployment_id\030\002 \001(\tB\003\340A\002\022Q"
          + "\n\026game_server_deployment\030\003 \001(\0132,.google."
          + "cloud.gaming.v1.GameServerDeploymentB\003\340A"
          + "\002\"k\n!DeleteGameServerDeploymentRequest\022F"
          + "\n\004name\030\001 \001(\tB8\340A\002\372A2\n0gameservices.googl"
          + "eapis.com/GameServerDeployment\"\254\001\n!Updat"
          + "eGameServerDeploymentRequest\022Q\n\026game_ser"
          + "ver_deployment\030\001 \001(\0132,.google.cloud.gami"
          + "ng.v1.GameServerDeploymentB\003\340A\002\0224\n\013updat"
          + "e_mask\030\002 \001(\0132\032.google.protobuf.FieldMask"
          + "B\003\340A\002\"\253\001\n(UpdateGameServerDeploymentRoll"
          + "outRequest\022I\n\007rollout\030\001 \001(\01323.google.clo"
          + "ud.gaming.v1.GameServerDeploymentRollout"
          + "B\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.google.prot"
          + "obuf.FieldMaskB\003\340A\002\"0\n\033FetchDeploymentSt"
          + "ateRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"\203\002\n\034FetchD"
          + "eploymentStateResponse\022`\n\rcluster_state\030"
          + "\001 \003(\0132I.google.cloud.gaming.v1.FetchDepl"
          + "oymentStateResponse.DeployedClusterState"
          + "\022\023\n\013unavailable\030\002 \003(\t\032l\n\024DeployedCluster"
          + "State\022\017\n\007cluster\030\001 \001(\t\022C\n\rfleet_details\030"
          + "\002 \003(\0132,.google.cloud.gaming.v1.DeployedF"
          + "leetDetails\"\260\003\n\024GameServerDeployment\022\014\n\004"
          + "name\030\001 \001(\t\0224\n\013create_time\030\002 \001(\0132\032.google"
          + ".protobuf.TimestampB\003\340A\003\0224\n\013update_time\030"
          + "\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022H"
          + "\n\006labels\030\004 \003(\01328.google.cloud.gaming.v1."
          + "GameServerDeployment.LabelsEntry\022\014\n\004etag"
          + "\030\007 \001(\t\022\023\n\013description\030\010 \001(\t\032-\n\013LabelsEnt"
          + "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\201\001\352A~"
          + "\n0gameservices.googleapis.com/GameServer"
          + "Deployment\022Jprojects/{project}/locations"
          + "/{location}/gameServerDeployments/{deplo"
          + "yment}\"\214\001\n\030GameServerConfigOverride\022@\n\017r"
          + "ealms_selector\030\001 \001(\0132%.google.cloud.gami"
          + "ng.v1.RealmSelectorH\000\022\030\n\016config_version\030"
          + "d \001(\tH\001B\n\n\010selectorB\010\n\006change\"\265\003\n\033GameSe"
          + "rverDeploymentRollout\022\014\n\004name\030\001 \001(\t\0224\n\013c"
          + "reate_time\030\002 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\0224\n\013update_time\030\003 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022\"\n\032default_game_"
          + "server_config\030\004 \001(\t\022V\n\034game_server_confi"
          + "g_overrides\030\005 \003(\01320.google.cloud.gaming."
          + "v1.GameServerConfigOverride\022\014\n\004etag\030\006 \001("
          + "\t:\221\001\352A\215\001\n7gameservices.googleapis.com/Ga"
          + "meServerDeploymentRollout\022Rprojects/{pro"
          + "ject}/locations/{location}/gameServerDep"
          + "loyments/{deployment}/rollout\"\343\001\n)Previe"
          + "wGameServerDeploymentRolloutRequest\022I\n\007r"
          + "ollout\030\001 \001(\01323.google.cloud.gaming.v1.Ga"
          + "meServerDeploymentRolloutB\003\340A\002\0224\n\013update"
          + "_mask\030\002 \001(\0132\032.google.protobuf.FieldMaskB"
          + "\003\340A\001\0225\n\014preview_time\030\003 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\001\"\212\001\n*PreviewGameServe"
          + "rDeploymentRolloutResponse\022\023\n\013unavailabl"
          + "e\030\002 \003(\t\022\014\n\004etag\030\003 \001(\t\0229\n\014target_state\030\004 "
          + "\001(\0132#.google.cloud.gaming.v1.TargetState"
          + "B\\\n\032com.google.cloud.gaming.v1P\001Z<google"
          + ".golang.org/genproto/googleapis/cloud/ga"
          + "ming/v1;gamingb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gaming.v1.Common.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_ListGameServerDeploymentsResponse_descriptor,
            new java.lang.String[] {
              "GameServerDeployments", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRolloutRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRolloutRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GetGameServerDeploymentRolloutRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "DeploymentId", "GameServerDeployment",
            });
    internal_static_google_cloud_gaming_v1_DeleteGameServerDeploymentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gaming_v1_DeleteGameServerDeploymentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_DeleteGameServerDeploymentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRequest_descriptor,
            new java.lang.String[] {
              "GameServerDeployment", "UpdateMask",
            });
    internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRolloutRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRolloutRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_UpdateGameServerDeploymentRolloutRequest_descriptor,
            new java.lang.String[] {
              "Rollout", "UpdateMask",
            });
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_FetchDeploymentStateRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_descriptor,
            new java.lang.String[] {
              "ClusterState", "Unavailable",
            });
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_DeployedClusterState_descriptor =
        internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_DeployedClusterState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_FetchDeploymentStateResponse_DeployedClusterState_descriptor,
            new java.lang.String[] {
              "Cluster", "FleetDetails",
            });
    internal_static_google_cloud_gaming_v1_GameServerDeployment_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_gaming_v1_GameServerDeployment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GameServerDeployment_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "UpdateTime", "Labels", "Etag", "Description",
            });
    internal_static_google_cloud_gaming_v1_GameServerDeployment_LabelsEntry_descriptor =
        internal_static_google_cloud_gaming_v1_GameServerDeployment_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_gaming_v1_GameServerDeployment_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GameServerDeployment_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gaming_v1_GameServerConfigOverride_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_gaming_v1_GameServerConfigOverride_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GameServerConfigOverride_descriptor,
            new java.lang.String[] {
              "RealmsSelector", "ConfigVersion", "Selector", "Change",
            });
    internal_static_google_cloud_gaming_v1_GameServerDeploymentRollout_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_gaming_v1_GameServerDeploymentRollout_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GameServerDeploymentRollout_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "DefaultGameServerConfig",
              "GameServerConfigOverrides",
              "Etag",
            });
    internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutRequest_descriptor,
            new java.lang.String[] {
              "Rollout", "UpdateMask", "PreviewTime",
            });
    internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewGameServerDeploymentRolloutResponse_descriptor,
            new java.lang.String[] {
              "Unavailable", "Etag", "TargetState",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gaming.v1.Common.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}