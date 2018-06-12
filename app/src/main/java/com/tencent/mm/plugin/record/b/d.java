package com.tencent.mm.plugin.record.b;

import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.plugin.record.a.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class d
  extends c<f>
{
  private i.a dVu = new d.1(this);
  
  final void a(f paramf, boolean paramBoolean)
  {
    x.d("MicroMsg.RecordMsgCDNService", "summersafecdn doJob, md5:%s, mediaId:%s, jobType[%d], jobStatus[%s]", new Object[] { paramf.field_dataId, paramf.field_mediaId, Integer.valueOf(paramf.field_type), Integer.valueOf(paramf.field_status) });
    if (-1 == paramf.field_status) {
      return;
    }
    i locali = new i();
    locali.dPV = this.dVu;
    locali.field_mediaId = paramf.field_mediaId;
    if (2 == paramf.field_type)
    {
      locali.ceW = true;
      locali.field_priority = b.dOj;
      locali.field_needStorage = false;
      locali.field_totalLen = paramf.field_totalLen;
      locali.field_aesKey = paramf.field_cdnKey;
      locali.field_fileId = paramf.field_cdnUrl;
      locali.dPV = this.dVu;
      locali.field_fullpath = paramf.field_path;
      locali.field_fileType = paramf.field_fileType;
      locali.field_talker = paramf.field_toUser;
      locali.field_force_aeskeycdn = false;
      locali.field_trysafecdn = true;
      locali.field_enable_hitcheck = paramBoolean;
      x.i("MicroMsg.RecordMsgCDNService", "[record] summersafecdn doJob TYPE_UPLOAD addSendTask field_force_aeskeycdn:%b, type[%d], aesKey[%s], fileId[%s], force_aeskeycdn[%b] trysafecdn[%b] enable_hitcheck[%b], mediaId:%s", new Object[] { Boolean.valueOf(locali.field_force_aeskeycdn), Integer.valueOf(locali.field_fileType), locali.field_aesKey, locali.field_fileId, Boolean.valueOf(locali.field_force_aeskeycdn), Boolean.valueOf(locali.field_trysafecdn), Boolean.valueOf(locali.field_enable_hitcheck), locali.field_mediaId });
      g.ND().c(locali);
    }
    for (;;)
    {
      x.d("MicroMsg.RecordMsgCDNService", "summersafecdn doJob, isSend:%B totallen:%d, aseKey:%s, url[%s], fullPath[%s], fileType[%d], enable_hitcheck[%b], force_aeskeycdn[%b]", new Object[] { Boolean.valueOf(locali.ceW), Integer.valueOf(locali.field_totalLen), locali.field_aesKey, locali.field_fileId, locali.field_fullpath, Integer.valueOf(locali.field_fileType), Boolean.valueOf(locali.field_enable_hitcheck), Boolean.valueOf(locali.field_force_aeskeycdn) });
      return;
      locali.ceW = false;
      locali.field_priority = b.dOk;
      locali.field_needStorage = false;
      locali.field_totalLen = paramf.field_totalLen;
      locali.field_aesKey = paramf.field_cdnKey;
      locali.field_fileId = paramf.field_cdnUrl;
      locali.dPV = this.dVu;
      locali.field_fullpath = (paramf.field_path + ".temp");
      locali.field_fileType = paramf.field_fileType;
      if (!bi.oW(paramf.field_tpdataurl))
      {
        locali.field_fileType = 19;
        locali.field_authKey = paramf.field_tpauthkey;
        locali.field_aesKey = paramf.field_tpaeskey;
        locali.dPW = paramf.field_tpdataurl;
        locali.field_fileId = "";
      }
      x.i("MicroMsg.RecordMsgCDNService", "[record] summersafecdn doJob TYPE_DOWNLOAD addSendTask field_force_aeskeycdn:%b, type[%d], aesKey[%s], fileId[%s], force_aeskeycdn[%b] trysafecdn[%b] enable_hitcheck[%b], mediaId:%s", new Object[] { Boolean.valueOf(locali.field_force_aeskeycdn), Integer.valueOf(locali.field_fileType), locali.field_aesKey, locali.field_fileId, Boolean.valueOf(locali.field_force_aeskeycdn), Boolean.valueOf(locali.field_trysafecdn), Boolean.valueOf(locali.field_enable_hitcheck), locali.field_mediaId });
      g.ND().b(locali, -1);
    }
  }
  
  protected final List<f> bqs()
  {
    List localList = n.getRecordMsgCDNStorage().bqp();
    x.d("MicroMsg.RecordMsgCDNService", "get to do jobs, size %d", new Object[] { Integer.valueOf(localList.size()) });
    return localList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/record/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */