package com.tencent.mm.hardcoder;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.format.Time;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class HardCoderJNI
{
  public static final long ACTION_ALLOC_MEMORY = 65536L;
  public static final long ACTION_ANIMATION = 2L;
  public static final long ACTION_DECODE_PIC = 64L;
  public static final long ACTION_DECODE_STREAM = 1024L;
  public static final long ACTION_DECODE_VIDEO = 256L;
  public static final long ACTION_DEXO2OAT = 1L;
  public static final long ACTION_ENCODE_PIC = 128L;
  public static final long ACTION_ENCODE_STREAM = 2048L;
  public static final long ACTION_ENCODE_VIDEO = 512L;
  public static final long ACTION_INIT_LISTVIEW = 16L;
  public static final long ACTION_NET_RX = 131072L;
  public static final long ACTION_NET_TX = 262144L;
  public static final long ACTION_ONCREATE = 4L;
  public static final long ACTION_ONDESTROY = 8L;
  public static final long ACTION_QUERY_SQL = 4096L;
  public static final long ACTION_READ_FILE = 16384L;
  public static final long ACTION_SCROLL_LISTVIEW = 32L;
  public static final long ACTION_WRITE_FILE = 32768L;
  public static final long ACTION_WRITE_SQL = 8192L;
  public static final int CPU_LEVEL_0 = 0;
  public static final int CPU_LEVEL_1 = 1;
  public static final int CPU_LEVEL_2 = 2;
  public static final int CPU_LEVEL_3 = 3;
  public static final long FLAG_ALBUM_SCROLL = 16384L;
  public static final long FLAG_ALL = -1L;
  public static final long FLAG_BOOT = 2L;
  public static final long FLAG_DB = 256L;
  public static final long FLAG_DECODE_PIC = 512L;
  public static final long FLAG_ENCODE_VIDEO = 4096L;
  public static final long FLAG_ENTER_CHATTING = 32L;
  public static final long FLAG_GIF_DROP_FRAME = 2048L;
  public static final long FLAG_GIF_INIT = 1024L;
  public static final long FLAG_MEDIA_GALLERY_SCROLL = 32768L;
  public static final long FLAG_QUIT_CHATTING = 64L;
  public static final long FLAG_RECEIVE_MSG = 4L;
  public static final long FLAG_SEND_MSG = 8L;
  public static final long FLAG_SEND_PIC_MSG = 16L;
  public static final long FLAG_SNS_MSG_SCROLL = 131072L;
  public static final long FLAG_SNS_SCROLL = 8192L;
  public static final long FLAG_SNS_USER_SCROLL = 65536L;
  public static final long FLAG_UPDATE_CHATROOM = 128L;
  public static final int FUNC_BASE = 1000;
  public static final int FUNC_CANCEL_CPU_CORE_FOR_THREAD = 1005;
  public static final int FUNC_CANCEL_CPU_HIGH_FREQ = 1003;
  public static final int FUNC_CANCEL_HIGH_IO_FREQ = 1007;
  public static final int FUNC_CANCEL_UNIFY_CPU_IO_THREAD_CORE = 1014;
  public static final int FUNC_CHECK_PERMISSION = 1001;
  public static final int FUNC_CPU_CORE_FOR_THREAD = 1004;
  public static final int FUNC_CPU_HIGH_FREQ = 1002;
  public static final int FUNC_HIGH_IO_FREQ = 1006;
  public static final int FUNC_REG_ANR_CALLBACK = 1010;
  public static final int FUNC_REG_PRELOAD_BOOT_RESOURCE = 1011;
  public static final int FUNC_RESET_SCREEN_RESOLUTION = 1009;
  public static final int FUNC_SET_SCREEN_RESOLUTION = 1008;
  public static final int FUNC_TERMINATE_APP = 1012;
  public static final int FUNC_UNIFY_CPU_IO_THREAD_CORE = 1013;
  public static final boolean HC_ENABLE_FOR_TEST = false;
  public static final int IDKEY_HARDCODER_FEATURES = 678;
  public static final int IDKEY_HARDCODER_PERFORMANCES = 679;
  public static final int IO_LEVEL_0 = 0;
  public static final int IO_LEVEL_1 = 1;
  public static final int IO_LEVEL_2 = 2;
  public static final int IO_LEVEL_3 = 3;
  public static final String KEY_HC_ALBUM_SCROLL_ACTION = "KEY_HC_ALBUM_SCROLL_ACTION";
  public static final String KEY_HC_ALBUM_SCROLL_CPU = "KEY_HC_ALBUM_SCROLL_CPU";
  public static final String KEY_HC_ALBUM_SCROLL_DELEY = "KEY_HC_ALBUM_SCROLL_DELEY";
  public static final String KEY_HC_ALBUM_SCROLL_ENABLE = "KEY_HCALBUM_SCROLL_ENABLE";
  public static final String KEY_HC_ALBUM_SCROLL_IO = "KEY_HC_ALBUM_SCROLL_IO";
  public static final String KEY_HC_ALBUM_SCROLL_THR = "KEY_HC_ALBUM_SCROLL_THR";
  public static final String KEY_HC_ALBUM_SCROLL_TIMEOUT = "KEY_HC_ALBUM_SCROLL_TIMEOUT";
  public static final String KEY_HC_BEGIN_TIME_HOUR = "KEY_HC_BEGIN_TIME_HOUR";
  public static final String KEY_HC_BEGIN_TIME_MIN = "KEY_HC_BEGIN_TIME_MIN";
  public static final String KEY_HC_BG_ENABLE = "KEY_HC_BG_ENABLE";
  public static final String KEY_HC_BOOT_ACTION = "KEY_HC_BOOT_ACTION";
  public static final String KEY_HC_BOOT_CPU = "KEY_HC_BOOT_CPU";
  public static final String KEY_HC_BOOT_DELEY = "KEY_HC_BOOT_DELEY";
  public static final String KEY_HC_BOOT_ENABLE = "KEY_HC_BOOT_ENABLE";
  public static final String KEY_HC_BOOT_IO = "KEY_HC_BOOT_IO";
  public static final String KEY_HC_BOOT_THR = "KEY_HC_BOOT_THR";
  public static final String KEY_HC_BOOT_TIMEOUT = "KEY_HC_BOOT_TIMEOUT";
  public static final String KEY_HC_DB_ACTION_QUERY = "KEY_HC_DB_ACTION_QUERY";
  public static final String KEY_HC_DB_ACTION_WRITE = "KEY_HC_DB_ACTION_WRITE";
  public static final String KEY_HC_DB_CPU = "KEY_HC_DB_CPU";
  public static final String KEY_HC_DB_DELEY_QUERY = "KEY_HC_DB_DELEY_QUERY";
  public static final String KEY_HC_DB_DELEY_WRITE = "KEY_HC_DB_DELEY_WRITE";
  public static final String KEY_HC_DB_ENABLE = "KEY_HC_DB_ENABLE";
  public static final String KEY_HC_DB_IO = "KEY_HC_DB_IO";
  public static final String KEY_HC_DB_THR = "KEY_HC_DB_THR";
  public static final String KEY_HC_DB_TIMEOUT = "KEY_HC_DB_TIMEOUT";
  public static final String KEY_HC_DB_TIMEOUT_BUSY = "KEY_HC_DB_TIMEOUT_BUSY";
  public static final String KEY_HC_DEBUG = "KEY_HC_DEBUG";
  public static final String KEY_HC_DECODE_PIC_ACTION = "KEY_HC_DECODE_PIC_ACTION";
  public static final String KEY_HC_DECODE_PIC_CPU = "KEY_HC_DECODE_PIC_CPU";
  public static final String KEY_HC_DECODE_PIC_DELEY = "KEY_HC_DECODE_PIC_DELEY";
  public static final String KEY_HC_DECODE_PIC_ENABLE = "KEY_HC_DECODE_PIC_ENABLE";
  public static final String KEY_HC_DECODE_PIC_IO = "KEY_HC_DECODE_PIC_IO";
  public static final String KEY_HC_DECODE_PIC_THR = "KEY_HC_DECODE_PIC_THR";
  public static final String KEY_HC_DECODE_PIC_TIMEOUT = "KEY_HC_DECODE_PIC_TIMEOUT";
  public static final String KEY_HC_ENABLE = "KEY_HC_ENABLE";
  public static final String KEY_HC_ENCODE_VIDEO_ACTION = "KEY_HC_ENCODE_VIDEO_ACTION";
  public static final String KEY_HC_ENCODE_VIDEO_CPU = "KEY_HC_ENCODE_VIDEO_CPU";
  public static final String KEY_HC_ENCODE_VIDEO_DELEY = "KEY_HC_ENCODE_VIDEO_DELEY";
  public static final String KEY_HC_ENCODE_VIDEO_ENABLE = "KEY_HC_ENCODE_VIDEO_ENABLE";
  public static final String KEY_HC_ENCODE_VIDEO_IO = "KEY_HC_ENCODE_VIDEO_IO";
  public static final String KEY_HC_ENCODE_VIDEO_THR = "KEY_HC_ENCODE_VIDEO_THR";
  public static final String KEY_HC_ENCODE_VIDEO_TIMEOUT = "KEY_HC_ENCODE_VIDEO_TIMEOUT";
  public static final String KEY_HC_END_TIME_HOUR = "KEY_HC_END_TIME_HOUR";
  public static final String KEY_HC_END_TIME_MIN = "KEY_HC_END_TIME_MIN";
  public static final String KEY_HC_ENTER_CHATTING_ACTION = "KEY_HC_ENTER_CHATTING_ACTION";
  public static final String KEY_HC_ENTER_CHATTING_CPU = "KEY_HC_ENTER_CHATTING_CPU";
  public static final String KEY_HC_ENTER_CHATTING_DELEY = "KEY_HC_ENTER_CHATTING_DELEY";
  public static final String KEY_HC_ENTER_CHATTING_ENABLE = "KEY_HC_ENTER_CHATTING_ENABLE";
  public static final String KEY_HC_ENTER_CHATTING_IO = "KEY_HC_ENTER_CHATTING_IO";
  public static final String KEY_HC_ENTER_CHATTING_THR = "KEY_HC_ENTER_CHATTING_THR";
  public static final String KEY_HC_ENTER_CHATTING_TIMEOUT = "KEY_HC_ENTER_CHATTING_TIMEOUT";
  public static final String KEY_HC_GIF_ACTION = "KEY_HC_GIF_ACTION";
  public static final String KEY_HC_GIF_CPU = "KEY_HC_GIF_CPU";
  public static final String KEY_HC_GIF_DELEY = "KEY_HC_GIF_DELEY";
  public static final String KEY_HC_GIF_ENABLE = "KEY_HC_GIF_ENABLE";
  public static final String KEY_HC_GIF_FRAME_ACTION = "KEY_HC_GIF_FRAME_ACTION";
  public static final String KEY_HC_GIF_FRAME_CPU = "KEY_HC_GIF_FRAME_CPU";
  public static final String KEY_HC_GIF_FRAME_DELEY = "KEY_HC_GIF_FRAME_DELEY";
  public static final String KEY_HC_GIF_FRAME_ENABLE = "KEY_HC_GIF_FRAME_ENABLE";
  public static final String KEY_HC_GIF_FRAME_IO = "KEY_HC_GIF_FRAME_IO";
  public static final String KEY_HC_GIF_FRAME_THR = "KEY_HC_GIF_FRAME_THR";
  public static final String KEY_HC_GIF_FRAME_TIMEOUT = "KEY_HC_GIF_FRAME_TIMEOUT";
  public static final String KEY_HC_GIF_IO = "KEY_HC_GIF_IO";
  public static final String KEY_HC_GIF_THR = "KEY_HC_GIF_THR";
  public static final String KEY_HC_GIF_TIMEOUT = "KEY_HC_GIF_TIMEOUT";
  public static final String KEY_HC_KV_FT = "KEY_HC_KV_FT";
  public static final String KEY_HC_KV_PER = "KEY_HC_KV_PER";
  public static final String KEY_HC_MEDIA_GALLERY_SCROLL_ACTION = "KEY_HC_MEDIA_GALLERY_SCROLL_ACTION";
  public static final String KEY_HC_MEDIA_GALLERY_SCROLL_CPU = "KEY_HC_MEDIA_GALLERY_SCROLL_CPU";
  public static final String KEY_HC_MEDIA_GALLERY_SCROLL_DELEY = "KEY_HC_MEDIA_GALLERY_SCROLL_DELEY";
  public static final String KEY_HC_MEDIA_GALLERY_SCROLL_ENABLE = "KEY_HC_MEDIA_GALLERY_SCROLL_ENABLE";
  public static final String KEY_HC_MEDIA_GALLERY_SCROLL_IO = "KEY_HC_MEDIA_GALLERY_SCROLL_IO";
  public static final String KEY_HC_MEDIA_GALLERY_SCROLL_THR = "KEY_HC_MEDIA_GALLERY_SCROLL_THR";
  public static final String KEY_HC_MEDIA_GALLERY_SCROLL_TIMEOUT = "KEY_HC_MEDIA_GALLERY_SCROLL_TIMEOUT";
  public static final String KEY_HC_QUIT_CHATTING_ACTION = "KEY_HC_QUIT_CHATTING_ACTION";
  public static final String KEY_HC_QUIT_CHATTING_CPU = "KEY_HC_QUIT_CHATTING_CPU";
  public static final String KEY_HC_QUIT_CHATTING_DELEY = "KEY_HC_QUIT_CHATTING_DELEY";
  public static final String KEY_HC_QUIT_CHATTING_ENABLE = "KEY_HC_QUIT_CHATTING_ENABLE";
  public static final String KEY_HC_QUIT_CHATTING_IO = "KEY_HC_QUIT_CHATTING_IO";
  public static final String KEY_HC_QUIT_CHATTING_THR = "KEY_HC_QUIT_CHATTING_THR";
  public static final String KEY_HC_QUIT_CHATTING_TIMEOUT = "KEY_HC_QUIT_CHATTING_TIMEOUT";
  public static final String KEY_HC_RECEIVE_MSG_ACTION = "KEY_HC_RECEIVE_MSG_ACTION";
  public static final String KEY_HC_RECEIVE_MSG_CPU = "KEY_HC_RECEIVE_MSG_CPU";
  public static final String KEY_HC_RECEIVE_MSG_DELEY = "KEY_HC_RECEIVE_MSG_DELEY";
  public static final String KEY_HC_RECEIVE_MSG_ENABLE = "KEY_HC_RECEIVE_MSG_ENABLE";
  public static final String KEY_HC_RECEIVE_MSG_IO = "KEY_HC_RECEIVE_MSG_IO";
  public static final String KEY_HC_RECEIVE_MSG_THR = "KEY_HC_RECEIVE_MSG_THR";
  public static final String KEY_HC_RECEIVE_MSG_TIMEOUT = "KEY_HC_RECEIVE_MSG_TIMEOUT";
  public static final String KEY_HC_RETRY_INTERVAL = "KEY_HC_RETRY_INTERVAL";
  public static final String KEY_HC_SEND_MSG_ACTION = "KEY_HC_SEND_MSG_ACTION";
  public static final String KEY_HC_SEND_MSG_CPU = "KEY_HC_SEND_MSG_CPU";
  public static final String KEY_HC_SEND_MSG_DELEY = "KEY_HC_SEND_MSG_DELEY";
  public static final String KEY_HC_SEND_MSG_ENABLE = "KEY_HC_SEND_MSG_ENABLE";
  public static final String KEY_HC_SEND_MSG_IO = "KEY_HC_SEND_MSG_IO";
  public static final String KEY_HC_SEND_MSG_THR = "KEY_HC_SEND_MSG_THR";
  public static final String KEY_HC_SEND_MSG_TIMEOUT = "KEY_HC_SEND_MSG_TIMEOUT";
  public static final String KEY_HC_SEND_PIC_MSG_ACTION = "KEY_HC_SEND_PIC_MSG_ACTION";
  public static final String KEY_HC_SEND_PIC_MSG_CPU = "KEY_HC_SEND_PIC_MSG_CPU";
  public static final String KEY_HC_SEND_PIC_MSG_DELEY = "KEY_HC_SEND_PIC_MSG_DELEY";
  public static final String KEY_HC_SEND_PIC_MSG_ENABLE = "KEY_HC_SEND_PIC_MSG_ENABLE";
  public static final String KEY_HC_SEND_PIC_MSG_IO = "KEY_HC_SEND_PIC_MSG_IO";
  public static final String KEY_HC_SEND_PIC_MSG_THR = "KEY_HC_SEND_PIC_MSG_THR";
  public static final String KEY_HC_SEND_PIC_MSG_TIMEOUT = "KEY_HC_SEND_PIC_MSG_TIMEOUT";
  public static final String KEY_HC_SNS_MSG_SCROLL_ACTION = "KEY_HC_SNS_MSG_SCROLL_ACTION";
  public static final String KEY_HC_SNS_MSG_SCROLL_CPU = "KEY_HC_SNS_MSG_SCROLL_CPU";
  public static final String KEY_HC_SNS_MSG_SCROLL_DELEY = "KEY_HC_SNS_MSG_SCROLL_DELEY";
  public static final String KEY_HC_SNS_MSG_SCROLL_ENABLE = "KEY_HC_SNS_MSG_SCROLL_ENABLE";
  public static final String KEY_HC_SNS_MSG_SCROLL_IO = "KEY_HC_SNS_MSG_SCROLL_IO";
  public static final String KEY_HC_SNS_MSG_SCROLL_THR = "KEY_HC_SNS_MSG_SCROLL_THR";
  public static final String KEY_HC_SNS_MSG_SCROLL_TIMEOUT = "KEY_HC_SNS_MSG_SCROLL_TIMEOUT";
  public static final String KEY_HC_SNS_SCROLL_ACTION = "KEY_HC_SNS_SCROLL_ACTION";
  public static final String KEY_HC_SNS_SCROLL_CPU = "KEY_HC_SNS_SCROLL_CPU";
  public static final String KEY_HC_SNS_SCROLL_DELEY = "KEY_HC_SNS_SCROLL_DELEY";
  public static final String KEY_HC_SNS_SCROLL_ENABLE = "KEY_HC_SNS_SCROLL_ENABLE";
  public static final String KEY_HC_SNS_SCROLL_IO = "KEY_HC_SNS_SCROLL_IO";
  public static final String KEY_HC_SNS_SCROLL_THR = "KEY_HC_SNS_SCROLL_THR";
  public static final String KEY_HC_SNS_SCROLL_TIMEOUT = "KEY_HC_SNS_SCROLL_TIMEOUT";
  public static final String KEY_HC_SNS_USER_SCROLL_ACTION = "KEY_HC_SNS_USER_SCROLL_ACTION";
  public static final String KEY_HC_SNS_USER_SCROLL_CPU = "KEY_HC_SNS_USER_SCROLL_CPU";
  public static final String KEY_HC_SNS_USER_SCROLL_DELEY = "KEY_HC_SNS_USER_SCROLL_DELEY";
  public static final String KEY_HC_SNS_USER_SCROLL_ENABLE = "KEY_HC_SNS_USER_SCROLL_ENABLE";
  public static final String KEY_HC_SNS_USER_SCROLL_IO = "KEY_HC_SNS_USER_SCROLL_IO";
  public static final String KEY_HC_SNS_USER_SCROLL_THR = "KEY_HC_SNS_USER_SCROLL_THR";
  public static final String KEY_HC_SNS_USER_SCROLL_TIMEOUT = "KEY_HC_SNS_USER_SCROLL_TIMEOUT";
  public static final String KEY_HC_SWITCH_ENABLE = "KEY_HC_SWITCH_ENABLE";
  public static final String KEY_HC_TIMEOUT_MARGIN = "KEY_HC_TIMEOUT_MARGIN";
  public static final String KEY_HC_TIME_LIMIT = "KEY_HC_TIME_LIMIT";
  public static final String KEY_HC_UIN_HASH = "KEY_HC_UIN_HASH";
  public static final String KEY_HC_UPDATE_CHATROOM_ACTION = "KEY_HC_UPDATE_CHATROOM_ACTION";
  public static final String KEY_HC_UPDATE_CHATROOM_CPU = "KEY_HC_UPDATE_CHATROOM_CPU";
  public static final String KEY_HC_UPDATE_CHATROOM_DELEY = "KEY_HC_UPDATE_CHATROOM_DELEY";
  public static final String KEY_HC_UPDATE_CHATROOM_ENABLE = "KEY_HC_UPDATE_CHATROOM_ENABLE";
  public static final String KEY_HC_UPDATE_CHATROOM_IO = "KEY_HC_UPDATE_CHATROOM_IO";
  public static final String KEY_HC_UPDATE_CHATROOM_MEMBER_COUNT = "KEY_HC_UPDATE_CHATROOM_MEMBER_COUNT";
  public static final String KEY_HC_UPDATE_CHATROOM_THR = "KEY_HC_UPDATE_CHATROOM_THR";
  public static final String KEY_HC_UPDATE_CHATROOM_TIMEOUT = "KEY_HC_UPDATE_CHATROOM_TIMEOUT";
  public static int RELOAD_SCENE_ABTEST = 0;
  public static int RELOAD_SCENE_DAY_RECEIVER = 0;
  public static int RELOAD_SCENE_INIT = 0;
  public static int RELOAD_SCENE_POST_RESET = 0;
  public static int RELOAD_SCENE_SETTING = 0;
  public static final int SCENE_ALBUM_SCROLL = 702;
  public static final int SCENE_BOOT = 101;
  public static final int SCENE_DB = 501;
  public static final int SCENE_DECODE_PIC = 601;
  public static final int SCENE_ENCODE_VIDEO = 603;
  public static final int SCENE_ENTER_CHATTING = 301;
  public static final int SCENE_GIF = 602;
  public static final int SCENE_MEDIA_GALLERY_SCROLL = 703;
  public static final int SCENE_QUIT_CHATTING = 302;
  public static final int SCENE_RECEIVE_MSG = 201;
  public static final int SCENE_SEND_MSG = 202;
  public static final int SCENE_SEND_PIC_MSG = 203;
  public static final int SCENE_SNS_MSG_SCROLL = 705;
  public static final int SCENE_SNS_SCROLL = 701;
  public static final int SCENE_SNS_USER_SCROLL = 704;
  public static final int SCENE_UPDATE_CHATROOM = 401;
  public static final String SETTING_SP_FILE = "hardcoder_setting";
  public static final String SETTING_UI_ACTION = "com.tencent.mm.action.HARDCODER_SETTING";
  public static final boolean SETTING_UI_ENABLE = false;
  private static final String TAG = "MicroMsg.HardCoderJNI";
  public static int TICK_RATE = 0;
  private static Callback callback;
  public static boolean checkEnv = false;
  private static final String clientSock = ".hardcoder.client.sock";
  public static HashMap<Long, String> flagKeyMap;
  public static boolean foreground = false;
  public static long hcAlbumScrollAction = 0L;
  public static int hcAlbumScrollCPU = 0;
  public static int hcAlbumScrollDelay = 0;
  public static boolean hcAlbumScrollEnable = false;
  public static int hcAlbumScrollIO = 0;
  public static boolean hcAlbumScrollThr = false;
  public static int hcAlbumScrollTimeout = 0;
  public static int hcBeginTimeHour = 0;
  public static int hcBeginTimeMin = 0;
  public static boolean hcBgEnable = false;
  public static long hcBootAction = 0L;
  public static int hcBootCPU = 0;
  public static int hcBootDelay = 0;
  public static boolean hcBootEnable = false;
  public static int hcBootIO = 0;
  public static boolean hcBootThr = false;
  public static int hcBootTimeout = 0;
  public static long hcDBActionQuery = 0L;
  public static long hcDBActionWrite = 0L;
  public static int hcDBCPU = 0;
  public static int hcDBDelayQuery = 0;
  public static int hcDBDelayWrite = 0;
  public static boolean hcDBEnable = false;
  public static int hcDBIO = 0;
  public static boolean hcDBThr = false;
  public static int hcDBTimeout = 0;
  public static int hcDBTimeoutBusy = 0;
  public static boolean hcDebug = false;
  public static long hcDecodePicAction = 0L;
  public static int hcDecodePicCPU = 0;
  public static int hcDecodePicDelay = 0;
  public static boolean hcDecodePicEnable = false;
  public static int hcDecodePicIO = 0;
  public static boolean hcDecodePicThr = false;
  public static int hcDecodePicTimeout = 0;
  public static boolean hcEnable = false;
  public static long hcEncodeVideoAction = 0L;
  public static int hcEncodeVideoCPU = 0;
  public static int hcEncodeVideoDelay = 0;
  public static boolean hcEncodeVideoEnable = false;
  public static int hcEncodeVideoIO = 0;
  public static boolean hcEncodeVideoThr = false;
  public static int hcEncodeVideoTimeout = 0;
  public static int hcEndTimeHour = 0;
  public static int hcEndTimeMin = 0;
  public static long hcEnterChattingAction = 0L;
  public static int hcEnterChattingCPU = 0;
  public static int hcEnterChattingDelay = 0;
  public static boolean hcEnterChattingEnable = false;
  public static int hcEnterChattingIO = 0;
  public static boolean hcEnterChattingThr = false;
  public static int hcEnterChattingTimeout = 0;
  public static long hcGifAction = 0L;
  public static int hcGifCPU = 0;
  public static int hcGifDelay = 0;
  public static boolean hcGifEnable = false;
  public static long hcGifFrameAction = 0L;
  public static int hcGifFrameCPU = 0;
  public static int hcGifFrameDelay = 0;
  public static boolean hcGifFrameEnable = false;
  public static int hcGifFrameIO = 0;
  public static boolean hcGifFrameThr = false;
  public static int hcGifFrameTimeout = 0;
  public static int hcGifIO = 0;
  public static boolean hcGifThr = false;
  public static int hcGifTimeout = 0;
  public static boolean hcKVFtReport = false;
  public static boolean hcKVPerReport = false;
  public static long hcMediaGalleryScrollAction = 0L;
  public static int hcMediaGalleryScrollCPU = 0;
  public static int hcMediaGalleryScrollDelay = 0;
  public static boolean hcMediaGalleryScrollEnable = false;
  public static int hcMediaGalleryScrollIO = 0;
  public static boolean hcMediaGalleryScrollThr = false;
  public static int hcMediaGalleryScrollTimeout = 0;
  public static long hcQuitChattingAction = 0L;
  public static int hcQuitChattingCPU = 0;
  public static int hcQuitChattingDelay = 0;
  public static boolean hcQuitChattingEnable = false;
  public static int hcQuitChattingIO = 0;
  public static boolean hcQuitChattingThr = false;
  public static int hcQuitChattingTimeout = 0;
  public static long hcReceiveMsgAction = 0L;
  public static int hcReceiveMsgCPU = 0;
  public static int hcReceiveMsgDelay = 0;
  public static boolean hcReceiveMsgEnable = false;
  public static int hcReceiveMsgIO = 0;
  public static boolean hcReceiveMsgThr = false;
  public static int hcReceiveMsgTimeout = 0;
  public static int hcRetryInterval = 0;
  public static long hcSNSMsgScrollAction = 0L;
  public static int hcSNSMsgScrollCPU = 0;
  public static int hcSNSMsgScrollDelay = 0;
  public static boolean hcSNSMsgScrollEnable = false;
  public static int hcSNSMsgScrollIO = 0;
  public static boolean hcSNSMsgScrollThr = false;
  public static int hcSNSMsgScrollTimeout = 0;
  public static long hcSNSScrollAction = 0L;
  public static int hcSNSScrollCPU = 0;
  public static int hcSNSScrollDelay = 0;
  public static boolean hcSNSScrollEnable = false;
  public static int hcSNSScrollIO = 0;
  public static boolean hcSNSScrollThr = false;
  public static int hcSNSScrollTimeout = 0;
  public static long hcSNSUserScrollAction = 0L;
  public static int hcSNSUserScrollCPU = 0;
  public static int hcSNSUserScrollDelay = 0;
  public static boolean hcSNSUserScrollEnable = false;
  public static int hcSNSUserScrollIO = 0;
  public static boolean hcSNSUserScrollThr = false;
  public static int hcSNSUserScrollTimeout = 0;
  public static long hcSendMsgAction = 0L;
  public static int hcSendMsgCPU = 0;
  public static int hcSendMsgDelay = 0;
  public static boolean hcSendMsgEnable = false;
  public static int hcSendMsgIO = 0;
  public static boolean hcSendMsgThr = false;
  public static int hcSendMsgTimeout = 0;
  public static long hcSendPicMsgAction = 0L;
  public static int hcSendPicMsgCPU = 0;
  public static int hcSendPicMsgDelay = 0;
  public static boolean hcSendPicMsgEnable = false;
  public static int hcSendPicMsgIO = 0;
  public static boolean hcSendPicMsgThr = false;
  public static int hcSendPicMsgTimeout = 0;
  public static boolean hcSwitchEnable = false;
  private static boolean hcSwitchOn = false;
  public static boolean hcTimeLimit = false;
  public static int hcTimeoutMargin = 0;
  public static int hcUinHash = 0;
  public static long hcUpdateChatroomAction = 0L;
  public static int hcUpdateChatroomCPU = 0;
  public static int hcUpdateChatroomDelay = 0;
  public static boolean hcUpdateChatroomEnable = false;
  public static int hcUpdateChatroomIO = 0;
  public static long hcUpdateChatroomMemberCount = 0L;
  public static boolean hcUpdateChatroomThr = false;
  public static int hcUpdateChatroomTimeout = 0;
  public static final long sHCALBUMSCROLLACTION = 96L;
  public static final int sHCALBUMSCROLLCPU = 3;
  public static final int sHCALBUMSCROLLDELAY = 0;
  public static final boolean sHCALBUMSCROLLENABLE = true;
  public static final int sHCALBUMSCROLLIO = 2;
  public static final boolean sHCALBUMSCROLLTHR = false;
  public static final int sHCALBUMSCROLLTIMEOUT = 1500;
  public static final int sHCBEGINHOUR = 8;
  public static final int sHCBEGINMIN = 0;
  public static final boolean sHCBGENABLE = true;
  public static final long sHCBOOTACTION = 4L;
  public static final int sHCBOOTCPU = 1;
  public static final int sHCBOOTDELAY = 0;
  public static final boolean sHCBOOTENABLE = true;
  public static final int sHCBOOTIO = 0;
  public static final boolean sHCBOOTTHR = false;
  public static final int sHCBOOTTIMEOUT = 5000;
  public static final long sHCDBACTION_QUERY = 4096L;
  public static final long sHCDBACTION_WRITE = 12288L;
  public static final int sHCDBCPU = 2;
  public static final int sHCDBDELAY_QUERY = 100;
  public static final int sHCDBDELAY_WRITE = 200;
  public static final boolean sHCDBENABLE = false;
  public static final int sHCDBIO = 2;
  public static final boolean sHCDBTHR = false;
  public static final int sHCDBTIMEOUT = 500;
  public static final int sHCDBTIMEOUT_BUSY = 5000;
  public static final boolean sHCDEBUG = false;
  public static final long sHCDECODEPICACTION = 16448L;
  public static final int sHCDECODEPICCPU = 2;
  public static final int sHCDECODEPICDELAY = 100;
  public static final boolean sHCDECODEPICENABLE = false;
  public static final int sHCDECODEPICIO = 2;
  public static final boolean sHCDECODEPICTHR = false;
  public static final int sHCDECODEPICTIMEOUT = 500;
  public static final boolean sHCENABLE = true;
  public static final long sHCENCODEVIDEOACTION = 81984L;
  public static final int sHCENCODEVIDEOCPU = 1;
  public static final int sHCENCODEVIDEODELAY = 0;
  public static final boolean sHCENCODEVIDEOENABLE = true;
  public static final int sHCENCODEVIDEOIO = 1;
  public static final boolean sHCENCODEVIDEOTHR = false;
  public static final int sHCENCODEVIDEOTIMEOUT = 20000;
  public static final int sHCENDHOUR = 23;
  public static final int sHCENDMIN = 0;
  public static final long sHCENTERCHATTINGACTION = 12294L;
  public static final int sHCENTERCHATTINGCPU = 2;
  public static final int sHCENTERCHATTINGDELAY = 0;
  public static final boolean sHCENTERCHATTINGENABLE = true;
  public static final int sHCENTERCHATTINGIO = 2;
  public static final boolean sHCENTERCHATTINGTHR = false;
  public static final int sHCENTERCHATTINGTIMEOUT = 1000;
  public static final long sHCGIFACTION = 81984L;
  public static final int sHCGIFCPU = 3;
  public static final int sHCGIFDELAY = 0;
  public static final boolean sHCGIFENABLE = true;
  public static final long sHCGIFFRAMEACTION = 65600L;
  public static final int sHCGIFFRAMECPU = 2;
  public static final int sHCGIFFRAMEDELAY = 0;
  public static final boolean sHCGIFFRAMEENABLE = true;
  public static final int sHCGIFFRAMEIO = 0;
  public static final boolean sHCGIFFRAMETHR = false;
  public static final int sHCGIFFRAMETIMEOUT = 1000;
  public static final int sHCGIFIO = 2;
  public static final boolean sHCGIFTHR = false;
  public static final int sHCGIFTIMEOUT = 500;
  public static final long sHCMEDIAGALLERYSCROLLACTION = 96L;
  public static final int sHCMEDIAGALLERYSCROLLCPU = 3;
  public static final int sHCMEDIAGALLERYSCROLLDELAY = 0;
  public static final boolean sHCMEDIAGALLERYSCROLLENABLE = true;
  public static final int sHCMEDIAGALLERYSCROLLIO = 2;
  public static final boolean sHCMEDIAGALLERYSCROLLTHR = false;
  public static final int sHCMEDIAGALLERYSCROLLTIMEOUT = 1500;
  private static a sHCPerfManager;
  public static final long sHCQUITCHATTINGACTION = 8194L;
  public static final int sHCQUITCHATTINGCPU = 2;
  public static final int sHCQUITCHATTINGDELAY = 0;
  public static final boolean sHCQUITCHATTINGENABLE = true;
  public static final int sHCQUITCHATTINGIO = 2;
  public static final boolean sHCQUITCHATTINGTHR = false;
  public static final int sHCQUITCHATTINGTIMEOUT = 800;
  public static final long sHCRECEIVEMSGACTION = 127040L;
  public static final int sHCRECEIVEMSGCPU = 2;
  public static final int sHCRECEIVEMSGDELAY = 500;
  public static final boolean sHCRECEIVEMSGENABLE = true;
  public static final int sHCRECEIVEMSGIO = 2;
  public static final boolean sHCRECEIVEMSGTHR = true;
  public static final int sHCRECEIVEMSGTIMEOUT = 1000;
  public static boolean sHCREPORT = false;
  public static final long sHCSENDMSGACTION = 12288L;
  public static final int sHCSENDMSGCPU = 3;
  public static final int sHCSENDMSGDELAY = 0;
  public static final boolean sHCSENDMSGENABLE = true;
  public static final int sHCSENDMSGIO = 0;
  public static final boolean sHCSENDMSGTHR = true;
  public static final int sHCSENDMSGTIMEOUT = 1000;
  public static final long sHCSENDPICMSGACTION = 123072L;
  public static final int sHCSENDPICMSGCPU = 1;
  public static final int sHCSENDPICMSGDELAY = 0;
  public static final boolean sHCSENDPICMSGENABLE = true;
  public static final int sHCSENDPICMSGIO = 2;
  public static final boolean sHCSENDPICMSGTHR = true;
  public static final int sHCSENDPICMSGTIMEOUT = 500;
  public static final long sHCSNSMSGSCROLLACTION = 96L;
  public static final int sHCSNSMSGSCROLLCPU = 3;
  public static final int sHCSNSMSGSCROLLDELAY = 0;
  public static final boolean sHCSNSMSGSCROLLENABLE = true;
  public static final int sHCSNSMSGSCROLLIO = 2;
  public static final boolean sHCSNSMSGSCROLLTHR = false;
  public static final int sHCSNSMSGSCROLLTIMEOUT = 1500;
  public static final long sHCSNSSCROLLACTION = 96L;
  public static final int sHCSNSSCROLLCPU = 3;
  public static final int sHCSNSSCROLLDELAY = 0;
  public static final boolean sHCSNSSCROLLENABLE = true;
  public static final int sHCSNSSCROLLIO = 2;
  public static final boolean sHCSNSSCROLLTHR = false;
  public static final int sHCSNSSCROLLTIMEOUT = 1500;
  public static final long sHCSNSUSERSCROLLACTION = 96L;
  public static final int sHCSNSUSERSCROLLCPU = 3;
  public static final int sHCSNSUSERSCROLLDELAY = 0;
  public static final boolean sHCSNSUSERSCROLLENABLE = true;
  public static final int sHCSNSUSERSCROLLIO = 2;
  public static final boolean sHCSNSUSERSCROLLTHR = false;
  public static final int sHCSNSUSERSCROLLTIMEOUT = 1500;
  public static final boolean sHCSWITCHENABLE = true;
  public static final boolean sHCTIMELIMIT = false;
  public static final int sHCUINHASH = 0;
  public static final long sHCUPDATECHATROOMACTION = 127040L;
  public static final int sHCUPDATECHATROOMCPU = 2;
  public static final int sHCUPDATECHATROOMDELAY = 0;
  public static final boolean sHCUPDATECHATROOMENABLE = true;
  public static final int sHCUPDATECHATROOMIO = 2;
  public static final int sHCUPDATECHATROOMMEMBERCOUNT = 50;
  public static final boolean sHCUPDATECHATROOMTHR = true;
  public static final int sHCUPDATECHATROOMTIMEOUT = 1000;
  public static final int sRETRYINTERVAL = 30;
  public static final int sTIMEOUTMARGIN = 0;
  private static final String serverPropKey = "persist.sys.hardcoder.name";
  
  static
  {
    checkEnv = false;
    hcDebug = false;
    TICK_RATE = 100;
    hcEnable = true;
    hcBgEnable = true;
    hcRetryInterval = 30;
    hcUinHash = 0;
    hcTimeoutMargin = 0;
    sHCREPORT = false;
    hcKVPerReport = false;
    hcKVFtReport = sHCREPORT;
    hcSwitchEnable = true;
    hcSwitchOn = true;
    hcTimeLimit = false;
    hcBeginTimeHour = 8;
    hcBeginTimeMin = 0;
    hcEndTimeHour = 23;
    hcEndTimeMin = 0;
    hcBootEnable = true;
    hcBootDelay = 0;
    hcBootCPU = 1;
    hcBootIO = 0;
    hcBootThr = false;
    hcBootTimeout = 5000;
    hcBootAction = 4L;
    hcEnterChattingEnable = true;
    hcEnterChattingDelay = 0;
    hcEnterChattingCPU = 2;
    hcEnterChattingIO = 2;
    hcEnterChattingThr = false;
    hcEnterChattingTimeout = 1000;
    hcEnterChattingAction = 12294L;
    hcQuitChattingEnable = true;
    hcQuitChattingDelay = 0;
    hcQuitChattingCPU = 2;
    hcQuitChattingIO = 2;
    hcQuitChattingThr = false;
    hcQuitChattingTimeout = 800;
    hcQuitChattingAction = 8194L;
    hcSendMsgEnable = true;
    hcSendMsgDelay = 0;
    hcSendMsgCPU = 3;
    hcSendMsgIO = 0;
    hcSendMsgThr = true;
    hcSendMsgTimeout = 1000;
    hcSendMsgAction = 12288L;
    hcSendPicMsgEnable = true;
    hcSendPicMsgDelay = 0;
    hcSendPicMsgCPU = 1;
    hcSendPicMsgIO = 2;
    hcSendPicMsgThr = true;
    hcSendPicMsgTimeout = 500;
    hcSendPicMsgAction = 123072L;
    hcReceiveMsgEnable = true;
    hcReceiveMsgDelay = 500;
    hcReceiveMsgCPU = 2;
    hcReceiveMsgIO = 2;
    hcReceiveMsgThr = true;
    hcReceiveMsgTimeout = 1000;
    hcReceiveMsgAction = 127040L;
    hcUpdateChatroomEnable = true;
    hcUpdateChatroomDelay = 0;
    hcUpdateChatroomCPU = 2;
    hcUpdateChatroomIO = 2;
    hcUpdateChatroomThr = true;
    hcUpdateChatroomTimeout = 1000;
    hcUpdateChatroomAction = 127040L;
    hcUpdateChatroomMemberCount = 50L;
    hcDBEnable = false;
    hcDBDelayQuery = 100;
    hcDBDelayWrite = 200;
    hcDBCPU = 2;
    hcDBIO = 2;
    hcDBThr = false;
    hcDBTimeout = 500;
    hcDBTimeoutBusy = 5000;
    hcDBActionQuery = 4096L;
    hcDBActionWrite = 12288L;
    hcEncodeVideoEnable = true;
    hcEncodeVideoDelay = 0;
    hcEncodeVideoCPU = 1;
    hcEncodeVideoIO = 1;
    hcEncodeVideoThr = false;
    hcEncodeVideoTimeout = 20000;
    hcEncodeVideoAction = 81984L;
    hcDecodePicEnable = false;
    hcDecodePicDelay = 100;
    hcDecodePicCPU = 2;
    hcDecodePicIO = 2;
    hcDecodePicThr = false;
    hcDecodePicTimeout = 500;
    hcDecodePicAction = 16448L;
    hcGifEnable = true;
    hcGifDelay = 0;
    hcGifCPU = 3;
    hcGifIO = 2;
    hcGifThr = false;
    hcGifTimeout = 500;
    hcGifAction = 81984L;
    hcGifFrameEnable = true;
    hcGifFrameDelay = 0;
    hcGifFrameCPU = 2;
    hcGifFrameIO = 0;
    hcGifFrameThr = false;
    hcGifFrameTimeout = 1000;
    hcGifFrameAction = 65600L;
    hcSNSScrollEnable = true;
    hcSNSScrollDelay = 0;
    hcSNSScrollCPU = 3;
    hcSNSScrollIO = 2;
    hcSNSScrollThr = false;
    hcSNSScrollTimeout = 1500;
    hcSNSScrollAction = 96L;
    hcSNSUserScrollEnable = true;
    hcSNSUserScrollDelay = 0;
    hcSNSUserScrollCPU = 3;
    hcSNSUserScrollIO = 2;
    hcSNSUserScrollThr = false;
    hcSNSUserScrollTimeout = 1500;
    hcSNSUserScrollAction = 96L;
    hcSNSMsgScrollEnable = true;
    hcSNSMsgScrollDelay = 0;
    hcSNSMsgScrollCPU = 3;
    hcSNSMsgScrollIO = 2;
    hcSNSMsgScrollThr = false;
    hcSNSMsgScrollTimeout = 1500;
    hcSNSMsgScrollAction = 96L;
    hcMediaGalleryScrollEnable = true;
    hcMediaGalleryScrollDelay = 0;
    hcMediaGalleryScrollCPU = 3;
    hcMediaGalleryScrollIO = 2;
    hcMediaGalleryScrollThr = false;
    hcMediaGalleryScrollTimeout = 1500;
    hcMediaGalleryScrollAction = 96L;
    hcAlbumScrollEnable = true;
    hcAlbumScrollDelay = 0;
    hcAlbumScrollCPU = 3;
    hcAlbumScrollIO = 2;
    hcAlbumScrollThr = false;
    hcAlbumScrollTimeout = 1500;
    hcAlbumScrollAction = 96L;
    flagKeyMap = new HashMap();
    RELOAD_SCENE_INIT = 0;
    RELOAD_SCENE_SETTING = 1;
    RELOAD_SCENE_POST_RESET = 2;
    RELOAD_SCENE_DAY_RECEIVER = 3;
    RELOAD_SCENE_ABTEST = 4;
    flagKeyMap.put(Long.valueOf(2L), "KEY_HC_BOOT_ENABLE");
    flagKeyMap.put(Long.valueOf(4L), "KEY_HC_RECEIVE_MSG_ENABLE");
    flagKeyMap.put(Long.valueOf(8L), "KEY_HC_SEND_MSG_ENABLE");
    flagKeyMap.put(Long.valueOf(16L), "KEY_HC_SEND_PIC_MSG_ENABLE");
    flagKeyMap.put(Long.valueOf(32L), "KEY_HC_ENTER_CHATTING_ENABLE");
    flagKeyMap.put(Long.valueOf(64L), "KEY_HC_QUIT_CHATTING_ENABLE");
    flagKeyMap.put(Long.valueOf(128L), "KEY_HC_UPDATE_CHATROOM_ENABLE");
    flagKeyMap.put(Long.valueOf(256L), "KEY_HC_DB_ENABLE");
    flagKeyMap.put(Long.valueOf(512L), "KEY_HC_DECODE_PIC_ENABLE");
    flagKeyMap.put(Long.valueOf(1024L), "KEY_HC_GIF_ENABLE");
    flagKeyMap.put(Long.valueOf(2048L), "KEY_HC_GIF_FRAME_ENABLE");
    flagKeyMap.put(Long.valueOf(4096L), "KEY_HC_ENCODE_VIDEO_ENABLE");
    flagKeyMap.put(Long.valueOf(8192L), "KEY_HC_SNS_SCROLL_ENABLE");
    flagKeyMap.put(Long.valueOf(16384L), "KEY_HCALBUM_SCROLL_ENABLE");
    flagKeyMap.put(Long.valueOf(32768L), "KEY_HC_MEDIA_GALLERY_SCROLL_ENABLE");
    flagKeyMap.put(Long.valueOf(65536L), "KEY_HC_SNS_USER_SCROLL_ENABLE");
    flagKeyMap.put(Long.valueOf(131072L), "KEY_HC_SNS_MSG_SCROLL_ENABLE");
    reloadSPConfig(RELOAD_SCENE_INIT);
  }
  
  public static native int cancelCpuCoreForThread(int[] paramArrayOfInt, int paramInt, long paramLong);
  
  public static native int cancelCpuHighFreq(int paramInt, long paramLong);
  
  public static native int cancelHighIOFreq(int paramInt, long paramLong);
  
  public static native int cancelUnifyCpuIOThreadCore(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int[] paramArrayOfInt, int paramInt, long paramLong);
  
  public static boolean checkHardCoderEnv()
  {
    String str1 = Build.MANUFACTURER;
    String str2 = Build.MODEL;
    String str3 = readServerAddr(false);
    x.i("MicroMsg.HardCoderJNI", "checkHardCoderEnv manufacture[%s] model[%s] remote[%s]", new Object[] { str1, str2, str3 });
    return !bi.oW(str3);
  }
  
  public static native int checkPermission(int paramInt1, int paramInt2, int paramInt3, long paramLong);
  
  /* Error */
  public static long getCpuFreqByCoreId(int paramInt)
  {
    // Byte code:
    //   0: new 1142	java/io/File
    //   3: dup
    //   4: new 1144	java/lang/StringBuilder
    //   7: dup
    //   8: ldc_w 1146
    //   11: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: iload_0
    //   15: invokevirtual 1153	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   18: ldc_w 1155
    //   21: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: invokespecial 1163	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: astore_3
    //   31: aload_3
    //   32: invokevirtual 1166	java/io/File:exists	()Z
    //   35: ifne +7 -> 42
    //   38: ldc2_w 77
    //   41: lreturn
    //   42: new 1168	java/io/FileReader
    //   45: dup
    //   46: aload_3
    //   47: invokespecial 1171	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   50: astore 5
    //   52: new 1173	java/io/BufferedReader
    //   55: dup
    //   56: aload 5
    //   58: invokespecial 1176	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   61: astore_3
    //   62: aload_3
    //   63: invokevirtual 1179	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   66: lconst_0
    //   67: invokestatic 1183	com/tencent/mm/sdk/platformtools/bi:getLong	(Ljava/lang/String;J)J
    //   70: lstore_1
    //   71: aload_3
    //   72: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   75: aload 5
    //   77: invokevirtual 1187	java/io/FileReader:close	()V
    //   80: lload_1
    //   81: lreturn
    //   82: astore_3
    //   83: ldc_w 457
    //   86: new 1144	java/lang/StringBuilder
    //   89: dup
    //   90: ldc_w 1189
    //   93: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   96: aload_3
    //   97: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   100: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   109: lload_1
    //   110: lreturn
    //   111: astore_3
    //   112: ldc_w 457
    //   115: new 1144	java/lang/StringBuilder
    //   118: dup
    //   119: ldc_w 1198
    //   122: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   125: aload_3
    //   126: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   129: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   138: goto -63 -> 75
    //   141: astore_3
    //   142: aconst_null
    //   143: astore 4
    //   145: aconst_null
    //   146: astore 5
    //   148: ldc_w 457
    //   151: new 1144	java/lang/StringBuilder
    //   154: dup
    //   155: ldc_w 1200
    //   158: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   161: aload_3
    //   162: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   165: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   174: aload 4
    //   176: ifnull +8 -> 184
    //   179: aload 4
    //   181: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   184: aload 5
    //   186: ifnull +8 -> 194
    //   189: aload 5
    //   191: invokevirtual 1187	java/io/FileReader:close	()V
    //   194: ldc2_w 1201
    //   197: lreturn
    //   198: astore_3
    //   199: ldc_w 457
    //   202: new 1144	java/lang/StringBuilder
    //   205: dup
    //   206: ldc_w 1198
    //   209: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   212: aload_3
    //   213: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   216: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   222: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   225: goto -41 -> 184
    //   228: astore_3
    //   229: ldc_w 457
    //   232: new 1144	java/lang/StringBuilder
    //   235: dup
    //   236: ldc_w 1189
    //   239: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   242: aload_3
    //   243: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   246: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   252: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   255: goto -61 -> 194
    //   258: astore_3
    //   259: aconst_null
    //   260: astore 4
    //   262: aconst_null
    //   263: astore 5
    //   265: aload 4
    //   267: ifnull +8 -> 275
    //   270: aload 4
    //   272: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   275: aload 5
    //   277: ifnull +8 -> 285
    //   280: aload 5
    //   282: invokevirtual 1187	java/io/FileReader:close	()V
    //   285: aload_3
    //   286: athrow
    //   287: astore 4
    //   289: ldc_w 457
    //   292: new 1144	java/lang/StringBuilder
    //   295: dup
    //   296: ldc_w 1198
    //   299: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   302: aload 4
    //   304: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   307: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   313: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   316: goto -41 -> 275
    //   319: astore 4
    //   321: ldc_w 457
    //   324: new 1144	java/lang/StringBuilder
    //   327: dup
    //   328: ldc_w 1189
    //   331: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   334: aload 4
    //   336: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   339: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   342: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   345: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   348: goto -63 -> 285
    //   351: astore_3
    //   352: aconst_null
    //   353: astore 4
    //   355: goto -90 -> 265
    //   358: astore 6
    //   360: aload_3
    //   361: astore 4
    //   363: aload 6
    //   365: astore_3
    //   366: goto -101 -> 265
    //   369: astore_3
    //   370: goto -105 -> 265
    //   373: astore_3
    //   374: aconst_null
    //   375: astore 4
    //   377: goto -229 -> 148
    //   380: astore 6
    //   382: aload_3
    //   383: astore 4
    //   385: aload 6
    //   387: astore_3
    //   388: goto -240 -> 148
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	391	0	paramInt	int
    //   70	40	1	l	long
    //   30	42	3	localObject1	Object
    //   82	15	3	localException1	Exception
    //   111	15	3	localException2	Exception
    //   141	21	3	localException3	Exception
    //   198	15	3	localException4	Exception
    //   228	15	3	localException5	Exception
    //   258	28	3	localObject2	Object
    //   351	10	3	localObject3	Object
    //   365	1	3	localObject4	Object
    //   369	1	3	localObject5	Object
    //   373	10	3	localException6	Exception
    //   387	1	3	localObject6	Object
    //   143	128	4	localObject7	Object
    //   287	16	4	localException7	Exception
    //   319	16	4	localException8	Exception
    //   353	31	4	localObject8	Object
    //   50	231	5	localFileReader	java.io.FileReader
    //   358	6	6	localObject9	Object
    //   380	6	6	localException9	Exception
    // Exception table:
    //   from	to	target	type
    //   75	80	82	java/lang/Exception
    //   71	75	111	java/lang/Exception
    //   0	38	141	java/lang/Exception
    //   42	52	141	java/lang/Exception
    //   179	184	198	java/lang/Exception
    //   189	194	228	java/lang/Exception
    //   0	38	258	finally
    //   42	52	258	finally
    //   270	275	287	java/lang/Exception
    //   280	285	319	java/lang/Exception
    //   52	62	351	finally
    //   62	71	358	finally
    //   148	174	369	finally
    //   52	62	373	java/lang/Exception
    //   62	71	380	java/lang/Exception
  }
  
  /* Error */
  public static long[] getCurrCpuFreq()
  {
    // Byte code:
    //   0: new 1206	java/util/Vector
    //   3: dup
    //   4: invokespecial 1207	java/util/Vector:<init>	()V
    //   7: astore 7
    //   9: iconst_0
    //   10: istore_0
    //   11: aconst_null
    //   12: astore_1
    //   13: aconst_null
    //   14: astore_2
    //   15: iload_0
    //   16: bipush 32
    //   18: if_icmpge +97 -> 115
    //   21: new 1142	java/io/File
    //   24: dup
    //   25: new 1144	java/lang/StringBuilder
    //   28: dup
    //   29: ldc_w 1146
    //   32: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   35: iload_0
    //   36: invokevirtual 1153	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   39: ldc_w 1155
    //   42: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokespecial 1163	java/io/File:<init>	(Ljava/lang/String;)V
    //   51: astore_3
    //   52: aload_3
    //   53: invokevirtual 1166	java/io/File:exists	()Z
    //   56: ifeq +59 -> 115
    //   59: new 1168	java/io/FileReader
    //   62: dup
    //   63: aload_3
    //   64: invokespecial 1171	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   67: astore_3
    //   68: new 1173	java/io/BufferedReader
    //   71: dup
    //   72: aload_3
    //   73: invokespecial 1176	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   76: astore 6
    //   78: aload 6
    //   80: astore 5
    //   82: aload_3
    //   83: astore 4
    //   85: aload 7
    //   87: aload 6
    //   89: invokevirtual 1179	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   92: lconst_0
    //   93: invokestatic 1183	com/tencent/mm/sdk/platformtools/bi:getLong	(Ljava/lang/String;J)J
    //   96: invokestatic 1089	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   99: invokevirtual 1211	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   102: pop
    //   103: iload_0
    //   104: iconst_1
    //   105: iadd
    //   106: istore_0
    //   107: aload 6
    //   109: astore_1
    //   110: aload_3
    //   111: astore_2
    //   112: goto -97 -> 15
    //   115: aload 7
    //   117: invokevirtual 1215	java/util/Vector:size	()I
    //   120: istore_0
    //   121: iload_0
    //   122: ifgt +81 -> 203
    //   125: aload_1
    //   126: ifnull +7 -> 133
    //   129: aload_1
    //   130: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   133: aload_2
    //   134: ifnull +7 -> 141
    //   137: aload_2
    //   138: invokevirtual 1187	java/io/FileReader:close	()V
    //   141: aconst_null
    //   142: areturn
    //   143: astore_1
    //   144: ldc_w 457
    //   147: new 1144	java/lang/StringBuilder
    //   150: dup
    //   151: ldc_w 1217
    //   154: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   157: aload_1
    //   158: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   161: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   170: goto -37 -> 133
    //   173: astore_1
    //   174: ldc_w 457
    //   177: new 1144	java/lang/StringBuilder
    //   180: dup
    //   181: ldc_w 1219
    //   184: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   187: aload_1
    //   188: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   191: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   197: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   200: goto -59 -> 141
    //   203: aload 7
    //   205: invokevirtual 1215	java/util/Vector:size	()I
    //   208: newarray <illegal type>
    //   210: astore_3
    //   211: iconst_0
    //   212: istore_0
    //   213: iload_0
    //   214: aload 7
    //   216: invokevirtual 1215	java/util/Vector:size	()I
    //   219: if_icmpge +25 -> 244
    //   222: aload_3
    //   223: iload_0
    //   224: aload 7
    //   226: iload_0
    //   227: invokevirtual 1223	java/util/Vector:get	(I)Ljava/lang/Object;
    //   230: checkcast 1085	java/lang/Long
    //   233: invokevirtual 1227	java/lang/Long:longValue	()J
    //   236: lastore
    //   237: iload_0
    //   238: iconst_1
    //   239: iadd
    //   240: istore_0
    //   241: goto -28 -> 213
    //   244: aload_1
    //   245: ifnull +7 -> 252
    //   248: aload_1
    //   249: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   252: aload_2
    //   253: ifnull +7 -> 260
    //   256: aload_2
    //   257: invokevirtual 1187	java/io/FileReader:close	()V
    //   260: aload_3
    //   261: areturn
    //   262: astore_1
    //   263: ldc_w 457
    //   266: new 1144	java/lang/StringBuilder
    //   269: dup
    //   270: ldc_w 1217
    //   273: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   276: aload_1
    //   277: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   280: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   286: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   289: goto -37 -> 252
    //   292: astore_1
    //   293: ldc_w 457
    //   296: new 1144	java/lang/StringBuilder
    //   299: dup
    //   300: ldc_w 1219
    //   303: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   306: aload_1
    //   307: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   310: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   316: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   319: goto -59 -> 260
    //   322: astore_2
    //   323: aconst_null
    //   324: astore_1
    //   325: aconst_null
    //   326: astore_3
    //   327: aload_1
    //   328: astore 5
    //   330: aload_3
    //   331: astore 4
    //   333: ldc_w 457
    //   336: new 1144	java/lang/StringBuilder
    //   339: dup
    //   340: ldc_w 1229
    //   343: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   346: aload_2
    //   347: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   350: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   356: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   359: aload_1
    //   360: ifnull +7 -> 367
    //   363: aload_1
    //   364: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   367: aload_3
    //   368: ifnull +7 -> 375
    //   371: aload_3
    //   372: invokevirtual 1187	java/io/FileReader:close	()V
    //   375: aconst_null
    //   376: areturn
    //   377: astore_1
    //   378: ldc_w 457
    //   381: new 1144	java/lang/StringBuilder
    //   384: dup
    //   385: ldc_w 1217
    //   388: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   391: aload_1
    //   392: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   395: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   401: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   404: goto -37 -> 367
    //   407: astore_1
    //   408: ldc_w 457
    //   411: new 1144	java/lang/StringBuilder
    //   414: dup
    //   415: ldc_w 1219
    //   418: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   421: aload_1
    //   422: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   425: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   428: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   431: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   434: goto -59 -> 375
    //   437: astore_3
    //   438: aconst_null
    //   439: astore_1
    //   440: aconst_null
    //   441: astore_2
    //   442: aload_1
    //   443: ifnull +7 -> 450
    //   446: aload_1
    //   447: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   450: aload_2
    //   451: ifnull +7 -> 458
    //   454: aload_2
    //   455: invokevirtual 1187	java/io/FileReader:close	()V
    //   458: aload_3
    //   459: athrow
    //   460: astore_1
    //   461: ldc_w 457
    //   464: new 1144	java/lang/StringBuilder
    //   467: dup
    //   468: ldc_w 1217
    //   471: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   474: aload_1
    //   475: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   478: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   481: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   484: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   487: goto -37 -> 450
    //   490: astore_1
    //   491: ldc_w 457
    //   494: new 1144	java/lang/StringBuilder
    //   497: dup
    //   498: ldc_w 1219
    //   501: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   504: aload_1
    //   505: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   508: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   511: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   514: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   517: goto -59 -> 458
    //   520: astore_3
    //   521: aload 5
    //   523: astore_1
    //   524: aload 4
    //   526: astore_2
    //   527: goto -85 -> 442
    //   530: astore_3
    //   531: goto -89 -> 442
    //   534: astore 4
    //   536: aload_3
    //   537: astore_2
    //   538: aload 4
    //   540: astore_3
    //   541: goto -99 -> 442
    //   544: astore_2
    //   545: aload 6
    //   547: astore_1
    //   548: goto -221 -> 327
    //   551: astore 4
    //   553: aload_2
    //   554: astore_3
    //   555: aload 4
    //   557: astore_2
    //   558: goto -231 -> 327
    //   561: astore_2
    //   562: goto -235 -> 327
    // Local variable table:
    //   start	length	slot	name	signature
    //   10	231	0	i	int
    //   12	118	1	localObject1	Object
    //   143	15	1	localException1	Exception
    //   173	76	1	localException2	Exception
    //   262	15	1	localException3	Exception
    //   292	15	1	localException4	Exception
    //   324	40	1	localObject2	Object
    //   377	15	1	localException5	Exception
    //   407	15	1	localException6	Exception
    //   439	8	1	localObject3	Object
    //   460	15	1	localException7	Exception
    //   490	15	1	localException8	Exception
    //   523	25	1	localObject4	Object
    //   14	243	2	localObject5	Object
    //   322	25	2	localException9	Exception
    //   441	97	2	localObject6	Object
    //   544	10	2	localException10	Exception
    //   557	1	2	localObject7	Object
    //   561	1	2	localException11	Exception
    //   51	321	3	localObject8	Object
    //   437	22	3	localObject9	Object
    //   520	1	3	localObject10	Object
    //   530	7	3	localObject11	Object
    //   540	15	3	localObject12	Object
    //   83	442	4	localObject13	Object
    //   534	5	4	localObject14	Object
    //   551	5	4	localException12	Exception
    //   80	442	5	localObject15	Object
    //   76	470	6	localBufferedReader	BufferedReader
    //   7	218	7	localVector	java.util.Vector
    // Exception table:
    //   from	to	target	type
    //   129	133	143	java/lang/Exception
    //   137	141	173	java/lang/Exception
    //   248	252	262	java/lang/Exception
    //   256	260	292	java/lang/Exception
    //   0	9	322	java/lang/Exception
    //   363	367	377	java/lang/Exception
    //   371	375	407	java/lang/Exception
    //   0	9	437	finally
    //   446	450	460	java/lang/Exception
    //   454	458	490	java/lang/Exception
    //   85	103	520	finally
    //   333	359	520	finally
    //   21	68	530	finally
    //   115	121	530	finally
    //   203	211	530	finally
    //   213	237	530	finally
    //   68	78	534	finally
    //   85	103	544	java/lang/Exception
    //   21	68	551	java/lang/Exception
    //   115	121	551	java/lang/Exception
    //   203	211	551	java/lang/Exception
    //   213	237	551	java/lang/Exception
    //   68	78	561	java/lang/Exception
  }
  
  /* Error */
  public static long[] getMyProcCpuTime()
  {
    // Byte code:
    //   0: new 1168	java/io/FileReader
    //   3: dup
    //   4: new 1144	java/lang/StringBuilder
    //   7: dup
    //   8: ldc_w 1232
    //   11: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: invokestatic 1237	android/os/Process:myPid	()I
    //   17: invokevirtual 1153	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   20: ldc_w 1239
    //   23: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: invokespecial 1240	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   32: astore_1
    //   33: new 1173	java/io/BufferedReader
    //   36: dup
    //   37: aload_1
    //   38: invokespecial 1176	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   41: astore_0
    //   42: aload_0
    //   43: astore_3
    //   44: aload_1
    //   45: astore_2
    //   46: aload_0
    //   47: invokevirtual 1179	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   50: ldc_w 1242
    //   53: invokevirtual 1248	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   56: astore 5
    //   58: aload_0
    //   59: astore_3
    //   60: aload_1
    //   61: astore_2
    //   62: iconst_2
    //   63: newarray <illegal type>
    //   65: astore 4
    //   67: aload_0
    //   68: astore_3
    //   69: aload_1
    //   70: astore_2
    //   71: aload 4
    //   73: iconst_0
    //   74: aload 5
    //   76: bipush 13
    //   78: aaload
    //   79: invokestatic 1252	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   82: lastore
    //   83: aload_0
    //   84: astore_3
    //   85: aload_1
    //   86: astore_2
    //   87: aload 4
    //   89: iconst_1
    //   90: aload 5
    //   92: bipush 14
    //   94: aaload
    //   95: invokestatic 1252	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   98: lastore
    //   99: aload_1
    //   100: invokevirtual 1187	java/io/FileReader:close	()V
    //   103: aload_0
    //   104: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   107: aload 4
    //   109: areturn
    //   110: astore_1
    //   111: ldc_w 457
    //   114: new 1144	java/lang/StringBuilder
    //   117: dup
    //   118: ldc_w 1254
    //   121: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   124: aload_1
    //   125: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   128: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   137: goto -34 -> 103
    //   140: astore_0
    //   141: ldc_w 457
    //   144: new 1144	java/lang/StringBuilder
    //   147: dup
    //   148: ldc_w 1256
    //   151: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   154: aload_0
    //   155: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   158: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   164: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   167: aload 4
    //   169: areturn
    //   170: astore 4
    //   172: aconst_null
    //   173: astore_0
    //   174: aconst_null
    //   175: astore_1
    //   176: aload_0
    //   177: astore_3
    //   178: aload_1
    //   179: astore_2
    //   180: ldc_w 457
    //   183: new 1144	java/lang/StringBuilder
    //   186: dup
    //   187: ldc_w 1258
    //   190: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   193: aload 4
    //   195: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   198: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   204: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   207: aload_1
    //   208: ifnull +7 -> 215
    //   211: aload_1
    //   212: invokevirtual 1187	java/io/FileReader:close	()V
    //   215: aload_0
    //   216: ifnull +7 -> 223
    //   219: aload_0
    //   220: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   223: aconst_null
    //   224: areturn
    //   225: astore_1
    //   226: ldc_w 457
    //   229: new 1144	java/lang/StringBuilder
    //   232: dup
    //   233: ldc_w 1254
    //   236: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   239: aload_1
    //   240: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   243: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   249: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   252: goto -37 -> 215
    //   255: astore_0
    //   256: ldc_w 457
    //   259: new 1144	java/lang/StringBuilder
    //   262: dup
    //   263: ldc_w 1256
    //   266: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   269: aload_0
    //   270: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   273: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   279: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   282: goto -59 -> 223
    //   285: astore_0
    //   286: aconst_null
    //   287: astore_3
    //   288: aconst_null
    //   289: astore_1
    //   290: aload_1
    //   291: ifnull +7 -> 298
    //   294: aload_1
    //   295: invokevirtual 1187	java/io/FileReader:close	()V
    //   298: aload_3
    //   299: ifnull +7 -> 306
    //   302: aload_3
    //   303: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   306: aload_0
    //   307: athrow
    //   308: astore_1
    //   309: ldc_w 457
    //   312: new 1144	java/lang/StringBuilder
    //   315: dup
    //   316: ldc_w 1254
    //   319: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   322: aload_1
    //   323: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   326: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   332: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   335: goto -37 -> 298
    //   338: astore_1
    //   339: ldc_w 457
    //   342: new 1144	java/lang/StringBuilder
    //   345: dup
    //   346: ldc_w 1256
    //   349: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   352: aload_1
    //   353: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   356: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   362: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   365: goto -59 -> 306
    //   368: astore_0
    //   369: aconst_null
    //   370: astore_3
    //   371: goto -81 -> 290
    //   374: astore_0
    //   375: aload_2
    //   376: astore_1
    //   377: goto -87 -> 290
    //   380: astore 4
    //   382: aconst_null
    //   383: astore_0
    //   384: goto -208 -> 176
    //   387: astore 4
    //   389: goto -213 -> 176
    // Local variable table:
    //   start	length	slot	name	signature
    //   41	63	0	localBufferedReader	BufferedReader
    //   140	15	0	localException1	Exception
    //   173	47	0	localObject1	Object
    //   255	15	0	localException2	Exception
    //   285	22	0	localObject2	Object
    //   368	1	0	localObject3	Object
    //   374	1	0	localObject4	Object
    //   383	1	0	localObject5	Object
    //   32	68	1	localFileReader	java.io.FileReader
    //   110	15	1	localException3	Exception
    //   175	37	1	localObject6	Object
    //   225	15	1	localException4	Exception
    //   289	6	1	localObject7	Object
    //   308	15	1	localException5	Exception
    //   338	15	1	localException6	Exception
    //   376	1	1	localObject8	Object
    //   45	331	2	localObject9	Object
    //   43	328	3	localObject10	Object
    //   65	103	4	arrayOfLong	long[]
    //   170	24	4	localException7	Exception
    //   380	1	4	localException8	Exception
    //   387	1	4	localException9	Exception
    //   56	35	5	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   99	103	110	java/lang/Exception
    //   103	107	140	java/lang/Exception
    //   0	33	170	java/lang/Exception
    //   211	215	225	java/lang/Exception
    //   219	223	255	java/lang/Exception
    //   0	33	285	finally
    //   294	298	308	java/lang/Exception
    //   302	306	338	java/lang/Exception
    //   33	42	368	finally
    //   46	58	374	finally
    //   62	67	374	finally
    //   71	83	374	finally
    //   87	99	374	finally
    //   180	207	374	finally
    //   33	42	380	java/lang/Exception
    //   46	58	387	java/lang/Exception
    //   62	67	387	java/lang/Exception
    //   71	83	387	java/lang/Exception
    //   87	99	387	java/lang/Exception
  }
  
  /* Error */
  public static int getThreadCoreId(int paramInt)
  {
    // Byte code:
    //   0: new 1168	java/io/FileReader
    //   3: dup
    //   4: new 1144	java/lang/StringBuilder
    //   7: dup
    //   8: ldc_w 1232
    //   11: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: invokestatic 1237	android/os/Process:myPid	()I
    //   17: invokevirtual 1153	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   20: ldc_w 1262
    //   23: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: iload_0
    //   27: invokevirtual 1153	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   30: ldc_w 1239
    //   33: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: invokespecial 1240	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   42: astore_2
    //   43: new 1173	java/io/BufferedReader
    //   46: dup
    //   47: aload_2
    //   48: invokespecial 1176	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   51: astore_1
    //   52: aload_1
    //   53: astore 4
    //   55: aload_2
    //   56: astore_3
    //   57: aload_1
    //   58: invokevirtual 1179	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   61: astore 5
    //   63: aload 5
    //   65: ifnonnull +72 -> 137
    //   68: aload_2
    //   69: invokevirtual 1187	java/io/FileReader:close	()V
    //   72: aload_1
    //   73: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   76: iconst_m1
    //   77: ireturn
    //   78: astore_2
    //   79: ldc_w 457
    //   82: new 1144	java/lang/StringBuilder
    //   85: dup
    //   86: ldc_w 1264
    //   89: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   92: aload_2
    //   93: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   96: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: goto -33 -> 72
    //   108: astore_1
    //   109: ldc_w 457
    //   112: new 1144	java/lang/StringBuilder
    //   115: dup
    //   116: ldc_w 1266
    //   119: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   122: aload_1
    //   123: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   126: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   132: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   135: iconst_m1
    //   136: ireturn
    //   137: aload_1
    //   138: astore 4
    //   140: aload_2
    //   141: astore_3
    //   142: aload 5
    //   144: ldc_w 1242
    //   147: invokevirtual 1248	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   150: bipush 38
    //   152: aaload
    //   153: iconst_0
    //   154: invokestatic 1270	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   157: istore_0
    //   158: aload_2
    //   159: invokevirtual 1187	java/io/FileReader:close	()V
    //   162: aload_1
    //   163: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   166: iload_0
    //   167: ireturn
    //   168: astore_1
    //   169: ldc_w 457
    //   172: new 1144	java/lang/StringBuilder
    //   175: dup
    //   176: ldc_w 1266
    //   179: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   182: aload_1
    //   183: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   186: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   192: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   195: iload_0
    //   196: ireturn
    //   197: astore_2
    //   198: ldc_w 457
    //   201: new 1144	java/lang/StringBuilder
    //   204: dup
    //   205: ldc_w 1264
    //   208: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   211: aload_2
    //   212: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   215: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   221: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   224: goto -62 -> 162
    //   227: astore 5
    //   229: aconst_null
    //   230: astore_1
    //   231: aconst_null
    //   232: astore_2
    //   233: aload_1
    //   234: astore 4
    //   236: aload_2
    //   237: astore_3
    //   238: ldc_w 457
    //   241: new 1144	java/lang/StringBuilder
    //   244: dup
    //   245: ldc_w 1272
    //   248: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   251: aload 5
    //   253: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   256: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   262: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   265: aload_2
    //   266: ifnull +7 -> 273
    //   269: aload_2
    //   270: invokevirtual 1187	java/io/FileReader:close	()V
    //   273: aload_1
    //   274: ifnull -198 -> 76
    //   277: aload_1
    //   278: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   281: iconst_m1
    //   282: ireturn
    //   283: astore_1
    //   284: ldc_w 457
    //   287: new 1144	java/lang/StringBuilder
    //   290: dup
    //   291: ldc_w 1266
    //   294: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   297: aload_1
    //   298: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   301: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   307: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   310: iconst_m1
    //   311: ireturn
    //   312: astore_2
    //   313: ldc_w 457
    //   316: new 1144	java/lang/StringBuilder
    //   319: dup
    //   320: ldc_w 1264
    //   323: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   326: aload_2
    //   327: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   330: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   333: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   336: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   339: goto -66 -> 273
    //   342: astore_1
    //   343: aconst_null
    //   344: astore 4
    //   346: aconst_null
    //   347: astore_2
    //   348: aload_2
    //   349: ifnull +7 -> 356
    //   352: aload_2
    //   353: invokevirtual 1187	java/io/FileReader:close	()V
    //   356: aload 4
    //   358: ifnull +8 -> 366
    //   361: aload 4
    //   363: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   366: aload_1
    //   367: athrow
    //   368: astore_2
    //   369: ldc_w 457
    //   372: new 1144	java/lang/StringBuilder
    //   375: dup
    //   376: ldc_w 1264
    //   379: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   382: aload_2
    //   383: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   386: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   392: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   395: goto -39 -> 356
    //   398: astore_2
    //   399: ldc_w 457
    //   402: new 1144	java/lang/StringBuilder
    //   405: dup
    //   406: ldc_w 1266
    //   409: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   412: aload_2
    //   413: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   416: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   419: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   422: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   425: goto -59 -> 366
    //   428: astore_1
    //   429: aconst_null
    //   430: astore 4
    //   432: goto -84 -> 348
    //   435: astore_1
    //   436: aload_3
    //   437: astore_2
    //   438: goto -90 -> 348
    //   441: astore 5
    //   443: aconst_null
    //   444: astore_1
    //   445: goto -212 -> 233
    //   448: astore 5
    //   450: goto -217 -> 233
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	453	0	paramInt	int
    //   51	22	1	localBufferedReader	BufferedReader
    //   108	55	1	localException1	Exception
    //   168	15	1	localException2	Exception
    //   230	48	1	localObject1	Object
    //   283	15	1	localException3	Exception
    //   342	25	1	localObject2	Object
    //   428	1	1	localObject3	Object
    //   435	1	1	localObject4	Object
    //   444	1	1	localObject5	Object
    //   42	27	2	localFileReader	java.io.FileReader
    //   78	81	2	localException4	Exception
    //   197	15	2	localException5	Exception
    //   232	38	2	localObject6	Object
    //   312	15	2	localException6	Exception
    //   347	6	2	localObject7	Object
    //   368	15	2	localException7	Exception
    //   398	15	2	localException8	Exception
    //   437	1	2	localObject8	Object
    //   56	381	3	localObject9	Object
    //   53	378	4	localObject10	Object
    //   61	82	5	str	String
    //   227	25	5	localException9	Exception
    //   441	1	5	localException10	Exception
    //   448	1	5	localException11	Exception
    // Exception table:
    //   from	to	target	type
    //   68	72	78	java/lang/Exception
    //   72	76	108	java/lang/Exception
    //   162	166	168	java/lang/Exception
    //   158	162	197	java/lang/Exception
    //   0	43	227	java/lang/Exception
    //   277	281	283	java/lang/Exception
    //   269	273	312	java/lang/Exception
    //   0	43	342	finally
    //   352	356	368	java/lang/Exception
    //   361	366	398	java/lang/Exception
    //   43	52	428	finally
    //   57	63	435	finally
    //   142	158	435	finally
    //   238	265	435	finally
    //   43	52	441	java/lang/Exception
    //   57	63	448	java/lang/Exception
    //   142	158	448	java/lang/Exception
  }
  
  /* Error */
  public static long[] getThreadCpuJiffies(int paramInt)
  {
    // Byte code:
    //   0: new 1168	java/io/FileReader
    //   3: dup
    //   4: new 1144	java/lang/StringBuilder
    //   7: dup
    //   8: ldc_w 1232
    //   11: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: invokestatic 1237	android/os/Process:myPid	()I
    //   17: invokevirtual 1153	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   20: ldc_w 1262
    //   23: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: iload_0
    //   27: invokevirtual 1153	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   30: ldc_w 1239
    //   33: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: invokespecial 1240	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   42: astore 6
    //   44: new 1173	java/io/BufferedReader
    //   47: dup
    //   48: aload 6
    //   50: invokespecial 1176	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   53: astore 5
    //   55: aload 5
    //   57: astore 8
    //   59: aload 6
    //   61: astore 7
    //   63: aload 5
    //   65: invokevirtual 1179	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   68: astore 9
    //   70: aload 9
    //   72: ifnonnull +78 -> 150
    //   75: aload 6
    //   77: invokevirtual 1187	java/io/FileReader:close	()V
    //   80: aload 5
    //   82: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   85: aconst_null
    //   86: areturn
    //   87: astore 6
    //   89: ldc_w 457
    //   92: new 1144	java/lang/StringBuilder
    //   95: dup
    //   96: ldc_w 1276
    //   99: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   102: aload 6
    //   104: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   107: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   113: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   116: goto -36 -> 80
    //   119: astore 5
    //   121: ldc_w 457
    //   124: new 1144	java/lang/StringBuilder
    //   127: dup
    //   128: ldc_w 1278
    //   131: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   134: aload 5
    //   136: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   139: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   148: aconst_null
    //   149: areturn
    //   150: aload 5
    //   152: astore 8
    //   154: aload 6
    //   156: astore 7
    //   158: aload 9
    //   160: ldc_w 1242
    //   163: invokevirtual 1248	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   166: astore 9
    //   168: aload 5
    //   170: astore 8
    //   172: aload 6
    //   174: astore 7
    //   176: aload 9
    //   178: bipush 13
    //   180: aaload
    //   181: lconst_0
    //   182: invokestatic 1183	com/tencent/mm/sdk/platformtools/bi:getLong	(Ljava/lang/String;J)J
    //   185: lstore_1
    //   186: aload 5
    //   188: astore 8
    //   190: aload 6
    //   192: astore 7
    //   194: aload 9
    //   196: bipush 14
    //   198: aaload
    //   199: lconst_0
    //   200: invokestatic 1183	com/tencent/mm/sdk/platformtools/bi:getLong	(Ljava/lang/String;J)J
    //   203: lstore_3
    //   204: aload 6
    //   206: invokevirtual 1187	java/io/FileReader:close	()V
    //   209: aload 5
    //   211: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   214: iconst_2
    //   215: newarray <illegal type>
    //   217: dup
    //   218: iconst_0
    //   219: lload_1
    //   220: lastore
    //   221: dup
    //   222: iconst_1
    //   223: lload_3
    //   224: lastore
    //   225: areturn
    //   226: astore 6
    //   228: ldc_w 457
    //   231: new 1144	java/lang/StringBuilder
    //   234: dup
    //   235: ldc_w 1276
    //   238: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   241: aload 6
    //   243: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   246: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   252: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   255: goto -46 -> 209
    //   258: astore 5
    //   260: ldc_w 457
    //   263: new 1144	java/lang/StringBuilder
    //   266: dup
    //   267: ldc_w 1278
    //   270: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   273: aload 5
    //   275: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   278: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   284: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   287: goto -73 -> 214
    //   290: astore 9
    //   292: aconst_null
    //   293: astore 5
    //   295: aconst_null
    //   296: astore 6
    //   298: aload 5
    //   300: astore 8
    //   302: aload 6
    //   304: astore 7
    //   306: ldc_w 457
    //   309: new 1144	java/lang/StringBuilder
    //   312: dup
    //   313: ldc_w 1280
    //   316: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   319: aload 9
    //   321: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   324: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   330: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   333: aload 6
    //   335: ifnull +8 -> 343
    //   338: aload 6
    //   340: invokevirtual 1187	java/io/FileReader:close	()V
    //   343: aload 5
    //   345: ifnull -260 -> 85
    //   348: aload 5
    //   350: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   353: aconst_null
    //   354: areturn
    //   355: astore 5
    //   357: ldc_w 457
    //   360: new 1144	java/lang/StringBuilder
    //   363: dup
    //   364: ldc_w 1278
    //   367: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   370: aload 5
    //   372: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   375: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   381: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   384: aconst_null
    //   385: areturn
    //   386: astore 6
    //   388: ldc_w 457
    //   391: new 1144	java/lang/StringBuilder
    //   394: dup
    //   395: ldc_w 1276
    //   398: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   401: aload 6
    //   403: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   406: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   409: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   412: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   415: goto -72 -> 343
    //   418: astore 5
    //   420: aconst_null
    //   421: astore 8
    //   423: aconst_null
    //   424: astore 6
    //   426: aload 6
    //   428: ifnull +8 -> 436
    //   431: aload 6
    //   433: invokevirtual 1187	java/io/FileReader:close	()V
    //   436: aload 8
    //   438: ifnull +8 -> 446
    //   441: aload 8
    //   443: invokevirtual 1186	java/io/BufferedReader:close	()V
    //   446: aload 5
    //   448: athrow
    //   449: astore 6
    //   451: ldc_w 457
    //   454: new 1144	java/lang/StringBuilder
    //   457: dup
    //   458: ldc_w 1276
    //   461: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   464: aload 6
    //   466: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   469: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   472: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   475: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   478: goto -42 -> 436
    //   481: astore 6
    //   483: ldc_w 457
    //   486: new 1144	java/lang/StringBuilder
    //   489: dup
    //   490: ldc_w 1278
    //   493: invokespecial 1149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   496: aload 6
    //   498: invokevirtual 1192	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   501: invokevirtual 1158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   504: invokevirtual 1162	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   507: invokestatic 1196	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   510: goto -64 -> 446
    //   513: astore 5
    //   515: aconst_null
    //   516: astore 8
    //   518: goto -92 -> 426
    //   521: astore 5
    //   523: aload 7
    //   525: astore 6
    //   527: goto -101 -> 426
    //   530: astore 9
    //   532: aconst_null
    //   533: astore 5
    //   535: goto -237 -> 298
    //   538: astore 9
    //   540: goto -242 -> 298
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	543	0	paramInt	int
    //   185	35	1	l1	long
    //   203	21	3	l2	long
    //   53	28	5	localBufferedReader	BufferedReader
    //   119	91	5	localException1	Exception
    //   258	16	5	localException2	Exception
    //   293	56	5	localObject1	Object
    //   355	16	5	localException3	Exception
    //   418	29	5	localObject2	Object
    //   513	1	5	localObject3	Object
    //   521	1	5	localObject4	Object
    //   533	1	5	localObject5	Object
    //   42	34	6	localFileReader	java.io.FileReader
    //   87	118	6	localException4	Exception
    //   226	16	6	localException5	Exception
    //   296	43	6	localObject6	Object
    //   386	16	6	localException6	Exception
    //   424	8	6	localObject7	Object
    //   449	16	6	localException7	Exception
    //   481	16	6	localException8	Exception
    //   525	1	6	localObject8	Object
    //   61	463	7	localObject9	Object
    //   57	460	8	localObject10	Object
    //   68	127	9	localObject11	Object
    //   290	30	9	localException9	Exception
    //   530	1	9	localException10	Exception
    //   538	1	9	localException11	Exception
    // Exception table:
    //   from	to	target	type
    //   75	80	87	java/lang/Exception
    //   80	85	119	java/lang/Exception
    //   204	209	226	java/lang/Exception
    //   209	214	258	java/lang/Exception
    //   0	44	290	java/lang/Exception
    //   348	353	355	java/lang/Exception
    //   338	343	386	java/lang/Exception
    //   0	44	418	finally
    //   431	436	449	java/lang/Exception
    //   441	446	481	java/lang/Exception
    //   44	55	513	finally
    //   63	70	521	finally
    //   158	168	521	finally
    //   176	186	521	finally
    //   194	204	521	finally
    //   306	333	521	finally
    //   44	55	530	java/lang/Exception
    //   63	70	538	java/lang/Exception
    //   158	168	538	java/lang/Exception
    //   176	186	538	java/lang/Exception
    //   194	204	538	java/lang/Exception
  }
  
  public static native int getTickRate();
  
  public static int initHardCoder()
  {
    if (!ad.cic())
    {
      x.w("MicroMsg.HardCoderJNI", "initHardCoder error process[%s]  ret -1 stack[%s]", new Object[] { ad.getProcessName(), bi.cjd() });
      return -1;
    }
    if (sHCPerfManager == null)
    {
      sHCPerfManager = new a();
      x.i("MicroMsg.HardCoderJNI", "initHardCoder new HCPerfManager[%s]", new Object[] { sHCPerfManager });
    }
    if (!isHCEnable())
    {
      x.i("MicroMsg.HardCoderJNI", "initHardCoder isHCEnable false  hcEnable hcSwitchEnable hcSwitchOn checkEnv[%b, %b, %b, %b] ret -2", new Object[] { Boolean.valueOf(hcEnable), Boolean.valueOf(hcSwitchEnable), Boolean.valueOf(hcSwitchOn), Boolean.valueOf(checkEnv) });
      return -2;
    }
    TICK_RATE = getTickRate();
    setDebug(hcDebug);
    setHCEnable(isHCEnable());
    x.i("MicroMsg.HardCoderJNI", "initHardCoder hcDebug[%b] hcEnable[%b] checkEnv[%b] TICK_RATE[%d]", new Object[] { Boolean.valueOf(hcDebug), Boolean.valueOf(hcEnable), Boolean.valueOf(checkEnv), Integer.valueOf(TICK_RATE) });
    return initHardCoder(readServerAddr(false), 0, ad.getPackageName() + ".hardcoder.client.sock", true);
  }
  
  private static native int initHardCoder(String paramString1, int paramInt, String paramString2, boolean paramBoolean);
  
  public static void initReporter(d.a parama)
  {
    d.a(parama);
  }
  
  private static boolean isActiveTime()
  {
    if (!hcTimeLimit) {}
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    do
    {
      do
      {
        do
        {
          return true;
          Time localTime = new Time();
          localTime.setToNow();
          i = localTime.hour;
          j = localTime.minute;
          k = hcBeginTimeHour;
          m = hcBeginTimeMin;
          n = hcEndTimeHour;
          i1 = hcEndTimeMin;
          if ((k == n) && (m == i1)) {
            return false;
          }
          if ((k != n) || (m >= i1)) {
            break;
          }
        } while ((i == k) && (j > m) && (j < i1));
        return false;
        if (n <= k) {
          break;
        }
      } while (((i > k) && (i < n)) || ((i == k) && (j > m)) || ((i == n) && (j < i1)));
      return false;
    } while (((n >= k) && ((k != n) || (m <= i1))) || ((i > k) && (i <= 23)) || ((i == k) && (j > m)) || ((i == n) && (j < i1)) || ((i > 0) && (i < n)));
    return false;
  }
  
  public static boolean isHCEnable()
  {
    return ((checkEnv & hcEnable)) && ((!hcSwitchEnable) || (hcSwitchOn));
  }
  
  public static native int isRunning();
  
  public static void onData(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.HardCoderJNI", "onData callbackType:" + paramInt1 + " timestamp:" + paramLong + " errCode:" + paramInt2 + " funcid:" + paramInt3 + " dataType:" + paramInt4);
    d.a(paramInt1, paramLong, paramInt2, paramInt3, paramInt4);
    if (callback != null) {}
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte);
      callback.onANR(paramArrayOfByte);
      return;
    }
    catch (Throwable paramArrayOfByte)
    {
      for (;;)
      {
        paramArrayOfByte = "";
      }
    }
  }
  
  public static String readServerAddr(boolean paramBoolean)
  {
    int i = 2;
    try
    {
      String str = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop persist.sys.hardcoder.name").getInputStream())).readLine();
      x.i("MicroMsg.HardCoderJNI", "readServerAddr Read prop[%s] result[%s] stack[%s]", new Object[] { "persist.sys.hardcoder.name", str, bi.cjd() });
      if ((paramBoolean) && (sHCPerfManager != null))
      {
        a locala = sHCPerfManager;
        if (bi.oW(str)) {
          i = 1;
        }
        locala.reportIDKey(true, i, 1, false);
      }
      return str;
    }
    catch (Throwable localThrowable)
    {
      x.printErrStackTrace("MicroMsg.HardCoderJNI", localThrowable, "readServerAddr", new Object[0]);
      if ((paramBoolean) && (sHCPerfManager != null)) {
        sHCPerfManager.reportIDKey(true, 3, 1, false);
      }
    }
    return "";
  }
  
  public static native int registerANRCallback(int paramInt, long paramLong);
  
  public static int registerANRCallback(Callback paramCallback)
  {
    if (!checkEnv) {
      return -1;
    }
    callback = paramCallback;
    return registerANRCallback(android.os.Process.myTid(), SystemClock.elapsedRealtime());
  }
  
  public static native int registerBootPreloadResource(String[] paramArrayOfString, int paramInt, long paramLong);
  
  public static void reloadSPConfig(int paramInt)
  {
    if (!ad.cic())
    {
      x.i("MicroMsg.HardCoderJNI", "reloadSPConfig but not mm return stack[%s]", new Object[] { bi.cjd() });
      return;
    }
    checkEnv = checkHardCoderEnv();
    SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("hardcoder_setting", 0);
    hcEnable = localSharedPreferences.getBoolean("KEY_HC_ENABLE", true);
    if (checkEnv) {
      setHCEnable(hcEnable);
    }
    hcBgEnable = localSharedPreferences.getBoolean("KEY_HC_BG_ENABLE", true);
    hcUinHash = localSharedPreferences.getInt("KEY_HC_UIN_HASH", 0);
    boolean bool = localSharedPreferences.getBoolean("KEY_HC_SWITCH_ENABLE", true);
    hcSwitchEnable = bool;
    hcSwitchOn = bool;
    int i;
    if ((hcEnable) && (hcSwitchEnable))
    {
      if (Calendar.getInstance().get(5) % 2 != 1) {
        break label2205;
      }
      bool = true;
      hcSwitchOn = bool;
      if (checkEnv)
      {
        setHCEnable(hcSwitchOn);
        if (!hcSwitchOn) {
          break label2210;
        }
        i = 8;
        label163:
        reportIDKey(true, i, 1, false);
      }
    }
    hcDebug = localSharedPreferences.getBoolean("KEY_HC_DEBUG", false);
    x.i("MicroMsg.HardCoderJNI", "reloadSPConfig scene:%d hcDebug:%b hcEnable:%b hcUinHash:%d hcSwitchEnable:%b hcSwitchOn:%b checkEnv:%b stack[%s]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(hcDebug), Boolean.valueOf(hcEnable), Integer.valueOf(hcUinHash), Boolean.valueOf(hcSwitchEnable), Boolean.valueOf(hcSwitchOn), Boolean.valueOf(checkEnv), bi.cjd() });
    hcRetryInterval = localSharedPreferences.getInt("KEY_HC_RETRY_INTERVAL", 30);
    if (localSharedPreferences.getInt("KEY_HC_KV_PER", 0) < hcUinHash)
    {
      bool = true;
      label297:
      hcKVPerReport = bool;
      if (localSharedPreferences.getInt("KEY_HC_KV_FT", 0) >= hcUinHash) {
        break label2221;
      }
    }
    label2205:
    label2210:
    label2221:
    for (bool = true;; bool = false)
    {
      hcKVFtReport = bool;
      hcTimeoutMargin = localSharedPreferences.getInt("KEY_HC_TIMEOUT_MARGIN", 0);
      hcTimeLimit = localSharedPreferences.getBoolean("KEY_HC_TIME_LIMIT", false);
      hcBeginTimeHour = localSharedPreferences.getInt("KEY_HC_BEGIN_TIME_HOUR", 8);
      hcBeginTimeMin = localSharedPreferences.getInt("KEY_HC_BEGIN_TIME_MIN", 0);
      hcEndTimeHour = localSharedPreferences.getInt("KEY_HC_END_TIME_HOUR", 23);
      hcEndTimeMin = localSharedPreferences.getInt("KEY_HC_END_TIME_MIN", 0);
      hcBootEnable = localSharedPreferences.getBoolean("KEY_HC_BOOT_ENABLE", true);
      hcBootDelay = localSharedPreferences.getInt("KEY_HC_BOOT_DELEY", 0);
      hcBootCPU = localSharedPreferences.getInt("KEY_HC_BOOT_CPU", 1);
      hcBootIO = localSharedPreferences.getInt("KEY_HC_BOOT_IO", 0);
      hcBootThr = localSharedPreferences.getBoolean("KEY_HC_BOOT_THR", false);
      hcBootTimeout = localSharedPreferences.getInt("KEY_HC_BOOT_TIMEOUT", 5000);
      hcBootAction = localSharedPreferences.getLong("KEY_HC_BOOT_ACTION", 4L);
      hcEnterChattingEnable = localSharedPreferences.getBoolean("KEY_HC_ENTER_CHATTING_ENABLE", true);
      hcEnterChattingDelay = localSharedPreferences.getInt("KEY_HC_ENTER_CHATTING_DELEY", 0);
      hcEnterChattingCPU = localSharedPreferences.getInt("KEY_HC_ENTER_CHATTING_CPU", 2);
      hcEnterChattingIO = localSharedPreferences.getInt("KEY_HC_ENTER_CHATTING_IO", 2);
      hcEnterChattingThr = localSharedPreferences.getBoolean("KEY_HC_ENTER_CHATTING_THR", false);
      hcEnterChattingTimeout = localSharedPreferences.getInt("KEY_HC_ENTER_CHATTING_TIMEOUT", 1000);
      hcEnterChattingAction = localSharedPreferences.getLong("KEY_HC_ENTER_CHATTING_ACTION", 12294L);
      hcQuitChattingEnable = localSharedPreferences.getBoolean("KEY_HC_QUIT_CHATTING_ENABLE", true);
      hcQuitChattingDelay = localSharedPreferences.getInt("KEY_HC_QUIT_CHATTING_DELEY", 0);
      hcQuitChattingCPU = localSharedPreferences.getInt("KEY_HC_QUIT_CHATTING_CPU", 2);
      hcQuitChattingIO = localSharedPreferences.getInt("KEY_HC_QUIT_CHATTING_IO", 2);
      hcQuitChattingThr = localSharedPreferences.getBoolean("KEY_HC_QUIT_CHATTING_THR", false);
      hcQuitChattingTimeout = localSharedPreferences.getInt("KEY_HC_QUIT_CHATTING_TIMEOUT", 800);
      hcQuitChattingAction = localSharedPreferences.getLong("KEY_HC_QUIT_CHATTING_ACTION", 8194L);
      hcSendMsgEnable = localSharedPreferences.getBoolean("KEY_HC_SEND_MSG_ENABLE", true);
      hcSendMsgDelay = localSharedPreferences.getInt("KEY_HC_SEND_MSG_DELEY", 0);
      hcSendMsgCPU = localSharedPreferences.getInt("KEY_HC_SEND_MSG_CPU", 3);
      hcSendMsgIO = localSharedPreferences.getInt("KEY_HC_SEND_MSG_IO", 0);
      hcSendMsgThr = localSharedPreferences.getBoolean("KEY_HC_SEND_MSG_THR", true);
      hcSendMsgTimeout = localSharedPreferences.getInt("KEY_HC_SEND_MSG_TIMEOUT", 1000);
      hcSendMsgAction = localSharedPreferences.getLong("KEY_HC_SEND_MSG_ACTION", 12288L);
      hcSendPicMsgEnable = localSharedPreferences.getBoolean("KEY_HC_SEND_PIC_MSG_ENABLE", true);
      hcSendPicMsgDelay = localSharedPreferences.getInt("KEY_HC_SEND_PIC_MSG_DELEY", 0);
      hcSendPicMsgCPU = localSharedPreferences.getInt("KEY_HC_SEND_PIC_MSG_CPU", 1);
      hcSendPicMsgIO = localSharedPreferences.getInt("KEY_HC_SEND_PIC_MSG_IO", 2);
      hcSendPicMsgThr = localSharedPreferences.getBoolean("KEY_HC_SEND_PIC_MSG_THR", true);
      hcSendPicMsgTimeout = localSharedPreferences.getInt("KEY_HC_SEND_PIC_MSG_TIMEOUT", 500);
      hcSendPicMsgAction = localSharedPreferences.getLong("KEY_HC_SEND_PIC_MSG_ACTION", 123072L);
      hcReceiveMsgEnable = localSharedPreferences.getBoolean("KEY_HC_RECEIVE_MSG_ENABLE", true);
      hcReceiveMsgDelay = localSharedPreferences.getInt("KEY_HC_RECEIVE_MSG_DELEY", 500);
      hcReceiveMsgCPU = localSharedPreferences.getInt("KEY_HC_RECEIVE_MSG_CPU", 2);
      hcReceiveMsgIO = localSharedPreferences.getInt("KEY_HC_RECEIVE_MSG_IO", 2);
      hcReceiveMsgThr = localSharedPreferences.getBoolean("KEY_HC_RECEIVE_MSG_THR", true);
      hcReceiveMsgTimeout = localSharedPreferences.getInt("KEY_HC_RECEIVE_MSG_TIMEOUT", 1000);
      hcReceiveMsgAction = localSharedPreferences.getLong("KEY_HC_RECEIVE_MSG_ACTION", 127040L);
      hcUpdateChatroomEnable = localSharedPreferences.getBoolean("KEY_HC_UPDATE_CHATROOM_ENABLE", true);
      hcUpdateChatroomDelay = localSharedPreferences.getInt("KEY_HC_UPDATE_CHATROOM_DELEY", 0);
      hcUpdateChatroomCPU = localSharedPreferences.getInt("KEY_HC_UPDATE_CHATROOM_CPU", 2);
      hcUpdateChatroomIO = localSharedPreferences.getInt("KEY_HC_UPDATE_CHATROOM_IO", 2);
      hcUpdateChatroomThr = localSharedPreferences.getBoolean("KEY_HC_UPDATE_CHATROOM_THR", true);
      hcUpdateChatroomTimeout = localSharedPreferences.getInt("KEY_HC_UPDATE_CHATROOM_TIMEOUT", 1000);
      hcUpdateChatroomAction = localSharedPreferences.getLong("KEY_HC_UPDATE_CHATROOM_ACTION", 127040L);
      hcUpdateChatroomMemberCount = localSharedPreferences.getLong("KEY_HC_UPDATE_CHATROOM_MEMBER_COUNT", 50L);
      hcDBEnable = localSharedPreferences.getBoolean("KEY_HC_DB_ENABLE", false);
      hcDBDelayQuery = localSharedPreferences.getInt("KEY_HC_DB_DELEY_QUERY", 100);
      hcDBDelayWrite = localSharedPreferences.getInt("KEY_HC_DB_DELEY_WRITE", 200);
      hcDBCPU = localSharedPreferences.getInt("KEY_HC_DB_CPU", 2);
      hcDBIO = localSharedPreferences.getInt("KEY_HC_DB_IO", 2);
      hcDBThr = localSharedPreferences.getBoolean("KEY_HC_DB_THR", false);
      hcDBTimeout = localSharedPreferences.getInt("KEY_HC_DB_TIMEOUT", 500);
      hcDBTimeoutBusy = localSharedPreferences.getInt("KEY_HC_DB_TIMEOUT_BUSY", 5000);
      hcDBActionQuery = localSharedPreferences.getLong("KEY_HC_DB_ACTION_QUERY", 4096L);
      hcDBActionWrite = localSharedPreferences.getLong("KEY_HC_DB_ACTION_WRITE", 12288L);
      hcEncodeVideoEnable = localSharedPreferences.getBoolean("KEY_HC_ENCODE_VIDEO_ENABLE", true);
      hcEncodeVideoDelay = localSharedPreferences.getInt("KEY_HC_ENCODE_VIDEO_DELEY", 0);
      hcEncodeVideoCPU = localSharedPreferences.getInt("KEY_HC_ENCODE_VIDEO_CPU", 1);
      hcEncodeVideoIO = localSharedPreferences.getInt("KEY_HC_ENCODE_VIDEO_IO", 1);
      hcEncodeVideoThr = localSharedPreferences.getBoolean("KEY_HC_ENCODE_VIDEO_THR", false);
      hcEncodeVideoTimeout = localSharedPreferences.getInt("KEY_HC_ENCODE_VIDEO_TIMEOUT", 20000);
      hcEncodeVideoAction = localSharedPreferences.getLong("KEY_HC_ENCODE_VIDEO_ACTION", 81984L);
      hcDecodePicEnable = localSharedPreferences.getBoolean("KEY_HC_DECODE_PIC_ENABLE", false);
      hcDecodePicDelay = localSharedPreferences.getInt("KEY_HC_DECODE_PIC_DELEY", 100);
      hcDecodePicCPU = localSharedPreferences.getInt("KEY_HC_DECODE_PIC_CPU", 2);
      hcDecodePicIO = localSharedPreferences.getInt("KEY_HC_DECODE_PIC_IO", 2);
      hcDecodePicThr = localSharedPreferences.getBoolean("KEY_HC_DECODE_PIC_THR", false);
      hcDecodePicTimeout = localSharedPreferences.getInt("KEY_HC_DECODE_PIC_TIMEOUT", 500);
      hcDecodePicAction = localSharedPreferences.getLong("KEY_HC_DECODE_PIC_ACTION", 16448L);
      hcGifEnable = localSharedPreferences.getBoolean("KEY_HC_GIF_ENABLE", true);
      hcGifDelay = localSharedPreferences.getInt("KEY_HC_GIF_DELEY", 0);
      hcGifCPU = localSharedPreferences.getInt("KEY_HC_GIF_CPU", 3);
      hcGifIO = localSharedPreferences.getInt("KEY_HC_GIF_IO", 2);
      hcGifThr = localSharedPreferences.getBoolean("KEY_HC_GIF_THR", false);
      hcGifTimeout = localSharedPreferences.getInt("KEY_HC_GIF_TIMEOUT", 500);
      hcGifAction = localSharedPreferences.getLong("KEY_HC_GIF_ACTION", 81984L);
      hcGifFrameEnable = localSharedPreferences.getBoolean("KEY_HC_GIF_FRAME_ENABLE", true);
      hcGifFrameDelay = localSharedPreferences.getInt("KEY_HC_GIF_FRAME_DELEY", 0);
      hcGifFrameCPU = localSharedPreferences.getInt("KEY_HC_GIF_FRAME_CPU", 2);
      hcGifFrameIO = localSharedPreferences.getInt("KEY_HC_GIF_FRAME_IO", 0);
      hcGifFrameThr = localSharedPreferences.getBoolean("KEY_HC_GIF_FRAME_THR", false);
      hcGifFrameTimeout = localSharedPreferences.getInt("KEY_HC_GIF_FRAME_TIMEOUT", 1000);
      hcGifFrameAction = localSharedPreferences.getLong("KEY_HC_GIF_FRAME_ACTION", 65600L);
      hcSNSScrollEnable = localSharedPreferences.getBoolean("KEY_HC_SNS_SCROLL_ENABLE", true);
      hcSNSScrollDelay = localSharedPreferences.getInt("KEY_HC_SNS_SCROLL_DELEY", 0);
      hcSNSScrollCPU = localSharedPreferences.getInt("KEY_HC_SNS_SCROLL_CPU", 3);
      hcSNSScrollIO = localSharedPreferences.getInt("KEY_HC_SNS_SCROLL_IO", 2);
      hcSNSScrollThr = localSharedPreferences.getBoolean("KEY_HC_SNS_SCROLL_THR", false);
      hcSNSScrollTimeout = localSharedPreferences.getInt("KEY_HC_SNS_SCROLL_TIMEOUT", 1500);
      hcSNSScrollAction = localSharedPreferences.getLong("KEY_HC_SNS_SCROLL_ACTION", 96L);
      hcSNSUserScrollEnable = localSharedPreferences.getBoolean("KEY_HC_SNS_USER_SCROLL_ENABLE", true);
      hcSNSUserScrollDelay = localSharedPreferences.getInt("KEY_HC_SNS_USER_SCROLL_DELEY", 0);
      hcSNSUserScrollCPU = localSharedPreferences.getInt("KEY_HC_SNS_USER_SCROLL_CPU", 3);
      hcSNSUserScrollIO = localSharedPreferences.getInt("KEY_HC_SNS_USER_SCROLL_IO", 2);
      hcSNSUserScrollThr = localSharedPreferences.getBoolean("KEY_HC_SNS_USER_SCROLL_THR", false);
      hcSNSUserScrollTimeout = localSharedPreferences.getInt("KEY_HC_SNS_USER_SCROLL_TIMEOUT", 1500);
      hcSNSUserScrollAction = localSharedPreferences.getLong("KEY_HC_SNS_USER_SCROLL_ACTION", 96L);
      hcSNSMsgScrollEnable = localSharedPreferences.getBoolean("KEY_HC_SNS_MSG_SCROLL_ENABLE", true);
      hcSNSMsgScrollDelay = localSharedPreferences.getInt("KEY_HC_SNS_MSG_SCROLL_DELEY", 0);
      hcSNSMsgScrollCPU = localSharedPreferences.getInt("KEY_HC_SNS_MSG_SCROLL_CPU", 3);
      hcSNSMsgScrollIO = localSharedPreferences.getInt("KEY_HC_SNS_MSG_SCROLL_IO", 2);
      hcSNSMsgScrollThr = localSharedPreferences.getBoolean("KEY_HC_SNS_MSG_SCROLL_THR", false);
      hcSNSMsgScrollTimeout = localSharedPreferences.getInt("KEY_HC_SNS_MSG_SCROLL_TIMEOUT", 1500);
      hcSNSMsgScrollAction = localSharedPreferences.getLong("KEY_HC_SNS_MSG_SCROLL_ACTION", 96L);
      hcMediaGalleryScrollEnable = localSharedPreferences.getBoolean("KEY_HC_MEDIA_GALLERY_SCROLL_ENABLE", true);
      hcMediaGalleryScrollDelay = localSharedPreferences.getInt("KEY_HC_MEDIA_GALLERY_SCROLL_DELEY", 0);
      hcMediaGalleryScrollCPU = localSharedPreferences.getInt("KEY_HC_MEDIA_GALLERY_SCROLL_CPU", 3);
      hcMediaGalleryScrollIO = localSharedPreferences.getInt("KEY_HC_MEDIA_GALLERY_SCROLL_IO", 2);
      hcMediaGalleryScrollThr = localSharedPreferences.getBoolean("KEY_HC_MEDIA_GALLERY_SCROLL_THR", false);
      hcMediaGalleryScrollTimeout = localSharedPreferences.getInt("KEY_HC_MEDIA_GALLERY_SCROLL_TIMEOUT", 1500);
      hcMediaGalleryScrollAction = localSharedPreferences.getLong("KEY_HC_MEDIA_GALLERY_SCROLL_ACTION", 96L);
      hcAlbumScrollEnable = localSharedPreferences.getBoolean("KEY_HCALBUM_SCROLL_ENABLE", true);
      hcAlbumScrollDelay = localSharedPreferences.getInt("KEY_HC_ALBUM_SCROLL_DELEY", 0);
      hcAlbumScrollCPU = localSharedPreferences.getInt("KEY_HC_ALBUM_SCROLL_CPU", 3);
      hcAlbumScrollIO = localSharedPreferences.getInt("KEY_HC_ALBUM_SCROLL_IO", 2);
      hcAlbumScrollThr = localSharedPreferences.getBoolean("KEY_HC_ALBUM_SCROLL_THR", false);
      hcAlbumScrollTimeout = localSharedPreferences.getInt("KEY_HC_ALBUM_SCROLL_TIMEOUT", 1500);
      hcAlbumScrollAction = localSharedPreferences.getLong("KEY_HC_ALBUM_SCROLL_ACTION", 96L);
      x.i("MicroMsg.HardCoderJNI", "reloadSPConfig Boot[%b] EnterChatting[%b] QuitChatting[%b] SendMsg[%b] SendPicMsg[%b] ReceiveMsg[%b] UpdateChatroom[%b] DB[%b] EncodeVideo[%b] DecodePic[%b] Gif[%b] GifFrame[%b] SNS[%b] MediaGallery[%b] Album[%b] SNSUser[%b] SNSMsg[%b]", new Object[] { Boolean.valueOf(hcBootEnable), Boolean.valueOf(hcEnterChattingEnable), Boolean.valueOf(hcQuitChattingEnable), Boolean.valueOf(hcSendMsgEnable), Boolean.valueOf(hcSendPicMsgEnable), Boolean.valueOf(hcReceiveMsgEnable), Boolean.valueOf(hcUpdateChatroomEnable), Boolean.valueOf(hcDBEnable), Boolean.valueOf(hcEncodeVideoEnable), Boolean.valueOf(hcDecodePicEnable), Boolean.valueOf(hcGifEnable), Boolean.valueOf(hcGifFrameEnable), Boolean.valueOf(hcSNSScrollEnable), Boolean.valueOf(hcMediaGalleryScrollEnable), Boolean.valueOf(hcAlbumScrollEnable), Boolean.valueOf(hcSNSUserScrollEnable), Boolean.valueOf(hcSNSMsgScrollEnable) });
      return;
      bool = false;
      break;
      i = 9;
      break label163;
      bool = false;
      break label297;
    }
  }
  
  public static void reportFPS(int paramInt1, long paramLong1, int paramInt2, long paramLong2, long paramLong3)
  {
    if (sHCPerfManager != null) {
      sHCPerfManager.djY.as(new b.a(paramInt1, paramLong1, paramInt2, paramLong2, paramLong3));
    }
  }
  
  public static void reportIDKey(boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2)
  {
    if (sHCPerfManager != null) {
      sHCPerfManager.reportIDKey(paramBoolean1, paramInt1, paramInt2, paramBoolean2);
    }
  }
  
  public static native int requestCpuCoreForThread(int paramInt1, long paramLong1, int[] paramArrayOfInt, int paramInt2, int paramInt3, long paramLong2);
  
  public static native int requestCpuHighFreq(int paramInt1, long paramLong1, int paramInt2, int paramInt3, int paramInt4, long paramLong2);
  
  public static native int requestHighIOFreq(int paramInt1, long paramLong1, int paramInt2, int paramInt3, int paramInt4, long paramLong2);
  
  public static native int requestScreenResolution(int paramInt1, String paramString, int paramInt2, long paramLong);
  
  public static native int requestUnifyCpuIOThreadCore(int paramInt1, long paramLong1, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4, int paramInt5, long paramLong2);
  
  public static native int resetScreenResolution(int paramInt, long paramLong);
  
  public static native void setDebug(boolean paramBoolean);
  
  public static native void setHCEnable(boolean paramBoolean);
  
  public static native void setRetryConnectInterval(int paramInt);
  
  public static int startPerformance(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong, String paramString)
  {
    if (!paramBoolean) {
      return -1;
    }
    if ((!hcBgEnable) && (!foreground)) {
      return -2;
    }
    if (sHCPerfManager == null)
    {
      x.w("MicroMsg.HardCoderJNI", "startPerformance error HCPerfManager is null, check process!");
      return -3;
    }
    a locala = sHCPerfManager;
    paramInt5 = hcTimeoutMargin + paramInt5;
    int i = android.os.Process.myTid();
    a.a locala1 = new a.a();
    locala1.delay = paramInt1;
    locala1.dkc = paramInt2;
    locala1.dkd = paramInt3;
    locala1.dke = paramInt4;
    locala1.dkb = paramInt5;
    locala1.scene = paramInt6;
    locala1.dkf = paramLong;
    locala1.dki = i;
    locala1.dkg = System.currentTimeMillis();
    locala1.startTime = (locala1.dkg + paramInt1);
    locala1.dkh = (locala1.dkg + paramInt1 + paramInt5);
    locala1.tag = paramString;
    locala1.lastUpdateTime = locala1.startTime;
    locala1.dkv = locala1.dkg;
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0) || (paramInt4 < 0) || (paramInt5 <= 0) || ((paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0))) {
      x.e("MicroMsg.HardCoder.HCPerfManager", "ErrorParam task:" + locala1.toString(locala1.dkg));
    }
    do
    {
      return 0;
      paramBoolean = locala.djZ.offer(locala1);
      if (hcDebug) {
        x.d("MicroMsg.HardCoder.HCPerfManager", "OutCallAddTask ret:" + paramBoolean + " task:" + locala1.toString(locala1.dkg));
      }
    } while (!paramBoolean);
    return locala1.hashCode();
  }
  
  public static int startTraceCpuLoad(int paramInt)
  {
    if (!checkEnv) {
      return -1;
    }
    return startTraceCpuLoad(paramInt, 20);
  }
  
  private static native int startTraceCpuLoad(int paramInt1, int paramInt2);
  
  public static int stopPerformace(boolean paramBoolean, int paramInt)
  {
    if (!paramBoolean)
    {
      paramInt = -1;
      return paramInt;
    }
    if (sHCPerfManager == null)
    {
      x.w("MicroMsg.HardCoderJNI", "stopPerformace error HCPerfManager is null, check process!");
      return -2;
    }
    a locala = sHCPerfManager;
    a.b localb = new a.b();
    localb.dkw = System.currentTimeMillis();
    localb.aeo = paramInt;
    if (paramInt != 0) {}
    for (paramBoolean = locala.djZ.offer(localb);; paramBoolean = false)
    {
      if (hcDebug) {
        x.d("MicroMsg.HardCoder.HCPerfManager", String.format("OutCallStopTask ret:%b, hashcode:%x", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) }));
      }
      if (paramBoolean) {
        break;
      }
      return -3;
    }
  }
  
  public static native int stopTraceCpuLoad(int paramInt);
  
  public static native int terminateApp(int paramInt, long paramLong);
  
  public static abstract interface Callback
  {
    public abstract void onANR(String paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/hardcoder/HardCoderJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */