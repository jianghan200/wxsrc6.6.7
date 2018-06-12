package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.text.Editable;
import android.text.Spanned;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.wenote.model.a.h;
import com.tencent.mm.plugin.wenote.model.a.j;
import com.tencent.mm.plugin.wenote.model.a.k;
import com.tencent.mm.plugin.wenote.model.a.n;
import com.tencent.mm.plugin.wenote.model.d;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c
{
  private static volatile c qpQ = null;
  public ArrayList<com.tencent.mm.plugin.wenote.model.a.b> gBc = null;
  public com.tencent.mm.plugin.wenote.model.nativenote.b.a qpR = null;
  public vx qpS = null;
  public int qpT = 0;
  public int qpU = 0;
  public int qpV = 0;
  public boolean qpW = false;
  
  private boolean Bw(int paramInt)
  {
    if ((this.gBc != null) && (paramInt >= 0) && (paramInt < this.gBc.size()))
    {
      a((com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(paramInt), false);
      this.gBc.remove(paramInt);
      return true;
    }
    return false;
  }
  
  private void a(com.tencent.mm.plugin.wenote.model.a.b paramb, boolean paramBoolean)
  {
    if (paramb == null) {
      return;
    }
    if (paramb.getType() == 1)
    {
      int i = com.tencent.mm.plugin.wenote.b.c.Sr(((h)paramb).content);
      if (paramBoolean)
      {
        this.qpU = (i + this.qpU);
        return;
      }
      this.qpU -= i;
      return;
    }
    if (paramBoolean)
    {
      this.qpV += 1;
      return;
    }
    this.qpV -= 1;
  }
  
  private void b(com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    if (paramb == null) {}
    for (;;)
    {
      return;
      n localn1 = (n)paramb;
      Object localObject;
      if (localn1.getType() > 1)
      {
        if (bi.oW(localn1.qpc))
        {
          if ((this.qpT == 0) && (this.gBc != null))
          {
            localObject = this.gBc.iterator();
            while (((Iterator)localObject).hasNext())
            {
              n localn2 = (n)((Iterator)localObject).next();
              if (localn2.qpc.startsWith("WeNote_"))
              {
                i = bi.getInt(localn2.qpc.substring(7), -1);
                if (i > this.qpT) {}
                for (;;)
                {
                  this.qpT = i;
                  break;
                  i = this.qpT;
                }
              }
            }
          }
          localObject = new StringBuilder("WeNote_");
          int i = this.qpT + 1;
          this.qpT = i;
          localn1.qpc = i;
        }
        localObject = com.tencent.mm.plugin.wenote.model.c.bZb().qnC;
        if (localObject != null) {
          break label217;
        }
        x.e("MicroMsg.Note.NoteDataManager", "processItem,item is %s, but get wnnote base is null", new Object[] { paramb.toString() });
      }
      while (bi.oW(paramb.jdM))
      {
        paramb.jdM = com.tencent.mm.plugin.wenote.model.f.Sf(paramb.toString());
        return;
        label217:
        if (((d)localObject).qnI == null) {
          x.e("MicroMsg.Note.NoteDataManager", "processItem,item is %s, but mEditorIdToDataItem is null", new Object[] { paramb.toString() });
        } else {
          ((d)localObject).qnI.put(localn1.qpc, localn1);
        }
      }
    }
  }
  
  private boolean b(int paramInt, com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    if ((paramb != null) && (this.gBc != null) && (paramInt >= 0) && (paramInt <= this.gBc.size()))
    {
      this.gBc.add(paramInt, paramb);
      a(paramb, true);
      return true;
    }
    return false;
  }
  
  public static c bZD()
  {
    if (qpQ == null) {}
    try
    {
      if (qpQ == null) {
        qpQ = new c();
      }
      return qpQ;
    }
    finally {}
  }
  
  private void bZH()
  {
    if (this.gBc != null)
    {
      Iterator localIterator = this.gBc.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)localIterator.next();
        localb.qoH = false;
        localb.qoN = false;
      }
    }
  }
  
  private static String cK(String paramString, int paramInt)
  {
    return String.format("<div><object data-type=\"%d\" id=\"%s\" name=\"%s\" class=\"item item-\"></object></div>", new Object[] { Integer.valueOf(paramInt), paramString, paramString });
  }
  
  public final com.tencent.mm.plugin.wenote.model.a.b Bv(int paramInt)
  {
    if ((this.gBc != null) && (paramInt >= 0) && (paramInt < this.gBc.size())) {
      return (com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(paramInt);
    }
    return null;
  }
  
  public final wl Sm(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.Note.NoteDataManager", "getFavProtoItem error ,htmlstr is null or nil");
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    for (;;)
    {
      Object localObject1;
      Object localObject2;
      try
      {
        if (i >= this.gBc.size()) {
          break label772;
        }
        localObject1 = (com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i);
        if (bi.oW(((com.tencent.mm.plugin.wenote.model.a.b)localObject1).jdM)) {
          ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).jdM = com.tencent.mm.plugin.wenote.model.f.Sf(localObject1.toString());
        }
        if (((com.tencent.mm.plugin.wenote.model.a.b)localObject1).getType() == -1) {
          if ((localArrayList.size() > 0) && (((n)localArrayList.get(localArrayList.size() - 1)).type == 1))
          {
            localObject1 = new StringBuilder();
            localObject2 = (h)localArrayList.get(localArrayList.size() - 1);
            ((h)localObject2).content += "\n";
          }
          else
          {
            localObject2 = new h();
            ((h)localObject2).content = "\n";
            ((h)localObject2).jdM = ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).jdM;
            ((h)localObject2).qpc = "-1";
            ((h)localObject2).type = 1;
            ((h)localObject2).qpb = null;
            localArrayList.add(localObject2);
          }
        }
      }
      finally {}
      if (((com.tencent.mm.plugin.wenote.model.a.b)localObject1).getType() >= -1)
      {
        if (((((com.tencent.mm.plugin.wenote.model.a.b)localObject1).getType() == 6) || (((com.tencent.mm.plugin.wenote.model.a.b)localObject1).getType() == 4)) && (bi.oW(((n)localObject1).bVd)))
        {
          localObject2 = new vx();
          ((vx)localObject2).UO(((com.tencent.mm.plugin.wenote.model.a.b)localObject1).jdM);
          ((vx)localObject2).UL(((com.tencent.mm.plugin.wenote.model.a.b)localObject1).bZh());
          localObject2 = com.tencent.mm.plugin.wenote.model.f.o((vx)localObject2);
          if (FileOp.cn((String)localObject2))
          {
            x.e("MicroMsg.Note.NoteDataManager", "getFavProtoItem,type = %d, localfile exsit,but localpath is null or nil, set path here", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.wenote.model.a.b)localObject1).getType()) });
            ((n)localObject1).bVd = ((String)localObject2);
          }
        }
        if (((com.tencent.mm.plugin.wenote.model.a.b)localObject1).getType() != 1)
        {
          localArrayList.add((n)localObject1);
        }
        else
        {
          localObject1 = (h)localObject1;
          if (bi.oW(((h)localObject1).content))
          {
            if ((localArrayList.size() > 0) && (((n)localArrayList.get(localArrayList.size() - 1)).getType() == 1))
            {
              localObject1 = new StringBuilder();
              localObject2 = (h)localArrayList.get(localArrayList.size() - 1);
              ((h)localObject2).content += "<br/>";
            }
            else
            {
              localObject2 = new h();
              ((h)localObject2).content = "<br/>";
              ((h)localObject2).jdM = ((h)localObject1).jdM;
              ((h)localObject2).qpc = ((h)localObject1).qpc;
              ((h)localObject2).type = ((h)localObject1).type;
              ((h)localObject2).qpb = null;
              localArrayList.add(localObject2);
            }
          }
          else
          {
            Object localObject3;
            if ((localArrayList.size() > 0) && (((n)localArrayList.get(localArrayList.size() - 1)).getType() == 1))
            {
              localObject2 = new StringBuilder();
              localObject3 = (h)localArrayList.get(localArrayList.size() - 1);
              ((h)localObject3).content += ((h)localObject1).content;
            }
            while ((i + 1 < this.gBc.size()) && (((com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i + 1)).getType() == 1) && (!bi.oW(((h)this.gBc.get(i + 1)).content)))
            {
              localObject1 = new StringBuilder();
              localObject2 = (h)localArrayList.get(localArrayList.size() - 1);
              ((h)localObject2).content += "<br/>";
              break;
              localObject2 = new h();
              ((h)localObject2).content = ((h)localObject1).content;
              ((h)localObject2).jdM = ((h)localObject1).jdM;
              ((h)localObject2).qpc = ((h)localObject1).qpc;
              ((h)localObject2).type = ((h)localObject1).type;
              ((h)localObject2).qpb = null;
              localArrayList.add(localObject2);
              continue;
              label772:
              paramString = Pattern.compile("<wx-", 2).matcher(paramString).replaceAll("<");
              localObject1 = Pattern.compile("</wx-", 2).matcher(paramString).replaceAll("</");
              try
              {
                paramString = ((String)localObject1).getBytes("UTF-8");
                i = 0;
              }
              catch (UnsupportedEncodingException paramString)
              {
                for (;;)
                {
                  try
                  {
                    ((File)localObject3).createNewFile();
                    if ((i != 0) || (com.tencent.mm.a.e.b((String)localObject2, paramString, paramString.length) != 0)) {
                      break;
                    }
                    this.qpS.UP((String)localObject2);
                    x.i("MicroMsg.Note.NoteDataManager", "do WNNoteBase.ConvertNote2FavProtoItem");
                    return d.a((String)localObject1, localArrayList, this.qpS);
                  }
                  catch (IOException paramString)
                  {
                    x.printErrStackTrace("MicroMsg.Note.NoteDataManager", paramString, "", new Object[0]);
                    return null;
                  }
                  paramString = paramString;
                  x.printErrStackTrace("MicroMsg.Note.NoteDataManager", paramString, "", new Object[0]);
                  x.e("MicroMsg.Note.NoteDataManager", "writehtmlfile, use utf-8 encoding error,use default encoding,");
                  i = 1;
                  paramString = null;
                }
              }
              this.qpS.CF(8);
              this.qpS.UY("WeNoteHtmlFile");
              this.qpS.kY(true);
              this.qpS.UL(".htm");
              this.qpS.UO(com.tencent.mm.plugin.wenote.model.f.Sf(this.qpS.toString()));
              localObject2 = com.tencent.mm.plugin.wenote.model.f.o(this.qpS);
              x.i("MicroMsg.Note.NoteDataManager", "getFavProtoItem: save note html file, path is %s", new Object[] { localObject2 });
              localObject3 = new File((String)localObject2);
              if (((File)localObject3).exists()) {
                ((File)localObject3).delete();
              }
              if (!((File)localObject3).exists()) {}
              x.i("MicroMsg.Note.NoteDataManager", "writefile error,return");
              Toast.makeText(ad.getContext(), ad.getContext().getString(R.l.favorite_save_fail), 1).show();
              return null;
            }
          }
        }
      }
      i += 1;
    }
  }
  
  public final String Sn(String paramString)
  {
    label169:
    label177:
    label183:
    label186:
    label193:
    label203:
    label210:
    for (;;)
    {
      int i;
      try
      {
        if (this.gBc == null) {
          break label183;
        }
        i = 0;
        if (i >= this.gBc.size()) {
          break label210;
        }
        if (((com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i)).getType() != 1) {
          break label177;
        }
        localObject = com.tencent.mm.plugin.wenote.b.b.Sp(((h)this.gBc.get(i)).content).replace("&lt;", "<").replace("&gt;", ">").replace(" ", " ");
        if (bi.oW((String)localObject)) {
          break label177;
        }
        localObject = ((String)localObject).split("\n");
        j = 0;
        if (j >= localObject.length) {
          break label169;
        }
        if (bi.oW(localObject[j].trim())) {
          break label203;
        }
        localObject = localObject[j];
        j = 1;
      }
      finally {}
      Object localObject = paramString;
      if (paramString.length() > 1000) {
        localObject = paramString.substring(0, 1000);
      }
      return (String)localObject;
      int j = 0;
      localObject = paramString;
      break label186;
      localObject = paramString;
      break label193;
      continue;
      paramString = (String)localObject;
      if (j == 0)
      {
        i += 1;
        paramString = (String)localObject;
        continue;
        j += 1;
      }
    }
  }
  
  public final boolean Y(ArrayList<com.tencent.mm.plugin.wenote.model.a.b> paramArrayList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    paramArrayList = paramArrayList.iterator();
    int i = 0;
    while (paramArrayList.hasNext())
    {
      com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.next();
      if (localb.getType() != 1) {
        i += 1;
      } else {
        localStringBuilder.append(((h)localb).content);
      }
    }
    return eq(com.tencent.mm.plugin.wenote.b.c.Sr(localStringBuilder.toString()), i);
  }
  
  public final int a(com.tencent.mm.plugin.wenote.model.a.b paramb, WXRTEditText paramWXRTEditText, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramb == null) {
      return -1;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramb);
    return a(localArrayList, paramWXRTEditText, true, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public final int a(ArrayList<com.tencent.mm.plugin.wenote.model.a.b> paramArrayList, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramArrayList == null) || (paramArrayList.size() <= 0) || (this.gBc == null) || (paramInt2 < 0) || (paramInt3 < 0) || (paramInt4 < 0) || (paramInt4 < paramInt3))
    {
      x.e("MicroMsg.Note.NoteDataManager", "pasteItemList,error,return");
      return -1;
    }
    if (com.tencent.mm.plugin.wenote.model.c.bZb().qnC == null)
    {
      x.e("MicroMsg.Note.NoteDataManager", "pasteItemList, but get wnnote base is null, return");
      return -1;
    }
    Object localObject1 = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.get(paramArrayList.size() - 1);
    if (localObject1 == null)
    {
      x.e("MicroMsg.Note.NoteDataManager", "pasteItemList, lastInsertItem is null");
      return -1;
    }
    ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).qoJ = -1;
    ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).qoH = true;
    ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).qoN = false;
    Object localObject3 = Bv(paramInt2);
    if (localObject3 == null)
    {
      x.e("MicroMsg.Note.NoteDataManager", "pasteItemList, item is null");
      return -1;
    }
    for (;;)
    {
      label457:
      label462:
      int j;
      int i;
      try
      {
        bZH();
        if ((paramInt1 != 0) || (((com.tencent.mm.plugin.wenote.model.a.b)localObject3).getType() != 1)) {
          break label848;
        }
        Object localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.a.a.Sk(((h)localObject3).content);
        if ((localObject2 == null) || (paramInt3 > ((Spanned)localObject2).length()) || (paramInt4 > ((Spanned)localObject2).length()))
        {
          if (localObject2 == null)
          {
            paramInt1 = -1;
            x.e("MicroMsg.Note.NoteDataManager", "pasteItemList error, oriText:%d  startOff:%d  endOff:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
            return -1;
          }
          paramInt1 = ((Spanned)localObject2).length();
          continue;
        }
        localObject1 = ((Spanned)localObject2).subSequence(0, paramInt3);
        CharSequence localCharSequence = ((Spanned)localObject2).subSequence(paramInt4, ((Spanned)localObject2).length());
        localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)localObject1);
        localObject1 = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)localCharSequence);
        localObject3 = (h)localObject3;
        if (!bi.oW((String)localObject2))
        {
          if (!((String)localObject2).endsWith("<br/>")) {
            break label831;
          }
          localObject2 = ((String)localObject2).substring(0, ((String)localObject2).length() - 5);
          ((h)localObject3).content = ((String)localObject2);
          paramInt2 += 1;
          paramInt1 = paramInt2;
          if (bi.oW((String)localObject1)) {
            break label834;
          }
          localObject3 = new h();
          ((h)localObject3).type = 1;
          localObject2 = localObject1;
          if (((String)localObject1).startsWith("<br/>")) {
            localObject2 = ((String)localObject1).substring(5, ((String)localObject1).length());
          }
          ((h)localObject3).content = ((String)localObject2);
          ((h)localObject3).qoJ = 0;
          ((h)localObject3).qoH = false;
          ((h)localObject3).qoN = false;
          b(paramInt2, (com.tencent.mm.plugin.wenote.model.a.b)localObject3);
          paramInt4 = 1;
          paramInt1 = paramInt2;
          paramInt3 = paramInt2;
          paramInt2 = paramInt1;
          paramInt1 = paramInt4;
          paramArrayList = paramArrayList.iterator();
          j = paramInt3;
          paramInt4 = paramInt1;
          i = paramInt2;
          if (paramArrayList.hasNext())
          {
            localObject1 = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.next();
            b((com.tencent.mm.plugin.wenote.model.a.b)localObject1);
            if (!b(paramInt3, (com.tencent.mm.plugin.wenote.model.a.b)localObject1)) {
              break label828;
            }
            paramInt3 += 1;
            break label828;
          }
        }
        else
        {
          if (!bi.oW((String)localObject1))
          {
            localObject2 = localObject1;
            if (((String)localObject1).startsWith("<br/>")) {
              localObject2 = ((String)localObject1).substring(5, ((String)localObject1).length());
            }
            ((h)localObject3).content = ((String)localObject2);
            paramInt1 = 0;
            paramInt4 = paramInt2;
            paramInt3 = paramInt2;
            paramInt2 = paramInt4;
            continue;
          }
          Bw(paramInt2);
          paramInt1 = paramInt2;
          if (this.qpR == null) {
            break label834;
          }
          this.qpR.Bq(paramInt2);
          paramInt1 = paramInt2;
          break label834;
          label605:
          paramArrayList = paramArrayList.iterator();
          paramInt2 = paramInt1;
          if (!paramArrayList.hasNext()) {
            break label863;
          }
          localObject1 = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.next();
          b((com.tencent.mm.plugin.wenote.model.a.b)localObject1);
          if (!b(paramInt2, (com.tencent.mm.plugin.wenote.model.a.b)localObject1)) {
            break label820;
          }
          paramInt2 += 1;
          break label860;
        }
        if ((j - 1 >= 0) && (j - 1 < bZD().size()))
        {
          paramInt1 = j - 1;
          if (this.qpR != null)
          {
            paramInt3 = j - i;
            paramInt2 = paramInt3;
            if (paramInt4 != 0) {
              paramInt2 = paramInt3 + 1;
            }
            if ((i >= 0) && (paramInt2 > 0)) {
              this.qpR.en(i, paramInt2);
            }
            if (i <= 0) {
              break label792;
            }
            this.qpR.eo(i - 1, bZD().size() - (i - 1));
            this.qpR.Br(paramInt1);
          }
          bZM();
          return paramInt1;
        }
      }
      finally {}
      paramInt1 = bZD().size() - 1;
      continue;
      label792:
      if (i == 0)
      {
        this.qpR.eo(i, bZD().size() - i);
        continue;
        label820:
        break label860;
        label828:
        label831:
        label834:
        label848:
        do
        {
          paramInt1 = paramInt2;
          break label605;
          break label462;
          break;
          paramInt4 = 0;
          paramInt2 = paramInt1;
          paramInt3 = paramInt1;
          paramInt1 = paramInt4;
          break label457;
        } while (paramInt1 == 1);
        paramInt1 = paramInt2 + 1;
        continue;
        label860:
        continue;
        label863:
        paramInt4 = 0;
        j = paramInt2;
        i = paramInt1;
      }
    }
  }
  
  public final int a(ArrayList<com.tencent.mm.plugin.wenote.model.a.b> paramArrayList, WXRTEditText paramWXRTEditText, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    if ((paramArrayList == null) || (paramArrayList.size() <= 0) || (this.gBc == null))
    {
      x.e("MicroMsg.Note.NoteDataManager", "insertItemList,error,return");
      return -1;
    }
    if (com.tencent.mm.plugin.wenote.model.c.bZb().qnC == null)
    {
      x.e("MicroMsg.Note.NoteDataManager", "insertItemList, but get wnnote base is null, return");
      return -1;
    }
    if ((paramBoolean2) && (Y(paramArrayList)) && (this.qpR != null))
    {
      this.qpR.bZn();
      return -1;
    }
    Object localObject1;
    if (paramBoolean1)
    {
      localObject1 = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.get(paramArrayList.size() - 1);
      ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).qoJ = -1;
      ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).qoH = true;
      ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).qoN = false;
      if ((paramWXRTEditText != null) && (paramWXRTEditText.qqV))
      {
        if (paramWXRTEditText.getEditTextType() != 2) {
          break label262;
        }
        ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).qoQ = 2;
      }
    }
    label170:
    int n;
    int i;
    label259:
    label262:
    int i1;
    label391:
    label419:
    int k;
    int m;
    for (;;)
    {
      paramWXRTEditText.qqV = false;
      ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).qoR = paramWXRTEditText.qoR;
      paramWXRTEditText.qoR = 0;
      if ((paramWXRTEditText == null) || (paramWXRTEditText.getRecyclerItemPosition() != 0)) {
        if (paramWXRTEditText != null) {
          break label616;
        }
      }
      label503:
      label584:
      label616:
      Object localObject2;
      Object localObject3;
      try
      {
        n = size();
        bZH();
        paramArrayList = paramArrayList.iterator();
        i = n;
        for (;;)
        {
          if (paramArrayList.hasNext())
          {
            paramWXRTEditText = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.next();
            b(paramWXRTEditText);
            if ((paramWXRTEditText == null) || (this.gBc == null)) {
              break label1230;
            }
            this.gBc.add(paramWXRTEditText);
            a(paramWXRTEditText, true);
            j = 1;
            if (j == 0) {
              break label1236;
            }
            i += 1;
            continue;
            if (paramWXRTEditText.getEditTextType() != 1) {
              break;
            }
            ((com.tencent.mm.plugin.wenote.model.a.b)localObject1).qoQ = 1;
            break;
            if ((paramWXRTEditText.getEditTextType() == 2) || (paramWXRTEditText.getSelectionStart() != 0) || (paramArrayList == null) || (paramArrayList.size() <= 0)) {
              break label170;
            }
            i = ((com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.get(0)).getType();
            if ((i != 2) && (i != 6) && (i != 5) && (i != 3) && (i != 4)) {
              break label170;
            }
            localObject1 = new h();
            ((h)localObject1).content = "";
            ((h)localObject1).qoH = false;
            ((h)localObject1).qoN = false;
            paramArrayList.add(0, localObject1);
            break label170;
          }
        }
        i1 = 0;
        if ((i - 1 < 0) || (i - 1 >= bZD().size())) {
          break;
        }
        j = i - 1;
        k = j;
        m = i;
        if (paramBoolean4)
        {
          j += 1;
          i += 1;
          bZH();
          if (j >= bZD().size()) {
            break label1125;
          }
          paramArrayList = bZD().Bv(j);
          k = j;
          m = i;
          if (paramArrayList != null)
          {
            paramArrayList.qoJ = 0;
            paramArrayList.qoH = true;
            paramArrayList.qoN = false;
            m = i;
            k = j;
          }
        }
        if (this.qpR != null)
        {
          j = m - n;
          i = j;
          if (i1 != 0) {
            i = j + 1;
          }
          if ((n >= 0) && (i > 0)) {
            this.qpR.en(n, i);
          }
          if (n <= 0) {
            break label1179;
          }
          this.qpR.eo(n - 1, bZD().size() - (n - 1));
          if (paramBoolean3) {
            this.qpR.bZm();
          }
          this.qpR.Br(k);
        }
        bZM();
        return k;
      }
      finally {}
    }
    int j = paramWXRTEditText.getRecyclerItemPosition();
    localObject2 = Bv(j);
    if (localObject2 == null) {
      return -1;
    }
    bZH();
    if ((paramWXRTEditText.getEditTextType() == 0) && (((com.tencent.mm.plugin.wenote.model.a.b)localObject2).getType() == 1))
    {
      localObject1 = paramWXRTEditText.getSelection();
      localObject3 = paramWXRTEditText.getText();
      paramWXRTEditText = ((Editable)localObject3).subSequence(0, ((e)localObject1).Tw);
      localObject3 = ((Editable)localObject3).subSequence(((e)localObject1).tK, ((Editable)localObject3).length());
      localObject1 = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)paramWXRTEditText);
      paramWXRTEditText = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)localObject3);
      localObject2 = (h)localObject2;
      if (!bi.oW((String)localObject1))
      {
        if (((String)localObject1).endsWith("<br/>"))
        {
          localObject1 = ((String)localObject1).substring(0, ((String)localObject1).length() - 5);
          label765:
          ((h)localObject2).content = ((String)localObject1);
          j += 1;
          i = j;
          if (bi.oW(paramWXRTEditText)) {
            break label1249;
          }
          localObject2 = new h();
          ((h)localObject2).type = 1;
          localObject1 = paramWXRTEditText;
          if (paramWXRTEditText.startsWith("<br/>")) {
            localObject1 = paramWXRTEditText.substring(5, paramWXRTEditText.length());
          }
          ((h)localObject2).content = ((String)localObject1);
          ((h)localObject2).qoJ = 0;
          ((h)localObject2).qoH = false;
          ((h)localObject2).qoN = false;
          b(j, (com.tencent.mm.plugin.wenote.model.a.b)localObject2);
          i = j;
          k = 1;
          m = j;
          j = i;
          i = m;
        }
      }
      else
      {
        for (;;)
        {
          label881:
          paramArrayList = paramArrayList.iterator();
          m = i;
          label890:
          i = m;
          n = j;
          i1 = k;
          if (!paramArrayList.hasNext()) {
            break;
          }
          paramWXRTEditText = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.next();
          b(paramWXRTEditText);
          if (!b(m, paramWXRTEditText)) {
            break label1223;
          }
          i = m + 1;
          break label1239;
          if (bi.oW(paramWXRTEditText)) {
            break label1005;
          }
          localObject1 = paramWXRTEditText;
          if (paramWXRTEditText.startsWith("<br/>")) {
            localObject1 = paramWXRTEditText.substring(5, paramWXRTEditText.length());
          }
          ((h)localObject2).content = ((String)localObject1);
          k = j;
          m = 0;
          i = j;
          j = k;
          k = m;
        }
        label1005:
        Bw(j);
        i = j;
        if (this.qpR == null) {
          break label1249;
        }
        this.qpR.Bq(j);
        i = j;
        break label1249;
      }
    }
    else if (paramWXRTEditText.getEditTextType() != 1)
    {
      j += 1;
      label1055:
      paramArrayList = paramArrayList.iterator();
      i = j;
    }
    label1125:
    label1179:
    label1217:
    label1223:
    label1230:
    label1236:
    label1239:
    label1249:
    label1259:
    for (;;)
    {
      if (paramArrayList.hasNext())
      {
        paramWXRTEditText = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.next();
        b(paramWXRTEditText);
        if (!b(i, paramWXRTEditText)) {
          break label1217;
        }
        i += 1;
        break label1259;
        j = bZD().size() - 1;
        break label419;
        paramArrayList = new h();
        paramArrayList.type = 1;
        paramArrayList.content = "";
        paramArrayList.qoJ = 0;
        paramArrayList.qoH = true;
        paramArrayList.qoN = false;
        b(j, paramArrayList);
        k = j;
        m = i;
        break label503;
        if (n != 0) {
          break label584;
        }
        this.qpR.eo(n, bZD().size() - n);
        break label584;
      }
      i1 = 0;
      n = j;
      break label391;
      break label1259;
      break label1055;
      i = m;
      break label1239;
      j = 0;
      break;
      break label259;
      m = i;
      break label890;
      break label765;
      j = i;
      k = 0;
      break label881;
    }
  }
  
  public final void a(String paramString, com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    int i = 0;
    for (;;)
    {
      try
      {
        if (this.gBc == null) {
          return;
        }
        if (i < this.gBc.size())
        {
          if (!((com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i)).bZg().equals(paramString)) {
            break label114;
          }
          a((com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i), false);
          this.gBc.set(i, paramb);
          a(paramb, true);
          if ((i == -1) || (this.qpR == null)) {
            break label113;
          }
          this.qpR.Bo(i);
          return;
        }
      }
      finally {}
      i = -1;
      continue;
      label113:
      return;
      label114:
      i += 1;
    }
  }
  
  public final boolean a(int paramInt, com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    boolean bool = true;
    for (;;)
    {
      try
      {
        if ((this.gBc == null) || (paramInt < 0) || (paramInt > this.gBc.size())) {
          break label119;
        }
        this.gBc.add(paramInt, paramb);
        a(paramb, true);
        if ((bool) && (this.qpR != null))
        {
          this.qpR.Bp(paramInt);
          if (paramInt > 0) {
            this.qpR.eo(paramInt - 1, this.gBc.size() - (paramInt - 1));
          }
        }
        else
        {
          return bool;
        }
      }
      finally {}
      this.qpR.eo(paramInt, this.gBc.size() - paramInt);
      return bool;
      label119:
      bool = false;
    }
  }
  
  public final boolean a(int paramInt, ArrayList<com.tencent.mm.plugin.wenote.model.a.b> paramArrayList)
  {
    boolean bool2;
    if ((paramArrayList == null) || (paramArrayList.size() <= 0))
    {
      bool2 = false;
      return bool2;
    }
    for (;;)
    {
      int k;
      int m;
      try
      {
        if (this.gBc == null) {
          break label162;
        }
        k = 0;
        j = 0;
        i = paramInt;
        paramInt = j;
        if ((k >= paramArrayList.size()) || (i < 0) || (i > this.gBc.size())) {
          break label191;
        }
        com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)paramArrayList.get(k);
        j = paramInt;
        m = i;
        if (localb == null) {
          break label176;
        }
        b(localb);
        this.gBc.add(i, localb);
        j = paramInt + 1;
        m = i + 1;
        a(localb, true);
      }
      finally {}
      bool2 = bool1;
      if (!bool1) {
        break;
      }
      bool2 = bool1;
      if (this.qpR == null) {
        break;
      }
      this.qpR.en(i - paramInt, paramInt);
      return bool1;
      label162:
      boolean bool1 = false;
      int j = 0;
      int i = paramInt;
      paramInt = j;
      continue;
      label176:
      k += 1;
      paramInt = j;
      i = m;
      continue;
      label191:
      bool1 = true;
    }
  }
  
  public final boolean a(com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    boolean bool = true;
    if (paramb != null) {}
    for (;;)
    {
      try
      {
        if (this.gBc != null)
        {
          this.gBc.add(paramb);
          a(paramb, true);
          return bool;
        }
      }
      finally {}
      bool = false;
    }
  }
  
  public final boolean ab(int paramInt, boolean paramBoolean)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    try
    {
      if (this.gBc != null)
      {
        bool1 = bool2;
        if (paramInt >= 0)
        {
          bool1 = bool2;
          if (paramInt < this.gBc.size())
          {
            a((com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(paramInt), false);
            this.gBc.remove(paramInt);
            bool1 = true;
          }
        }
      }
      if ((bool1) && (paramBoolean) && (this.qpR != null))
      {
        this.qpR.Bq(paramInt);
        if (paramInt > 0) {
          this.qpR.eo(paramInt - 1, this.gBc.size() - (paramInt - 1));
        }
      }
      else
      {
        return bool1;
      }
    }
    finally {}
    this.qpR.eo(paramInt, this.gBc.size() - paramInt);
    return bool1;
  }
  
  public final void ac(int paramInt, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        if (this.gBc == null) {
          return;
        }
        if ((paramInt >= 0) && (paramInt < this.gBc.size()))
        {
          com.tencent.mm.plugin.wenote.model.a.b localb1 = (com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(paramInt);
          if ((localb1 != null) && (localb1.qoO != paramBoolean))
          {
            localb1.qoO = paramBoolean;
            if (this.qpR != null) {
              this.qpR.Bo(paramInt);
            }
          }
          return;
        }
      }
      finally {}
      if (paramInt == -1)
      {
        paramInt = 0;
        while (paramInt < this.gBc.size())
        {
          com.tencent.mm.plugin.wenote.model.a.b localb2 = (com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(paramInt);
          if ((localb2 != null) && (localb2.qoO != paramBoolean))
          {
            localb2.qoO = paramBoolean;
            if (this.qpR != null) {
              this.qpR.Bo(paramInt);
            }
          }
          paramInt += 1;
        }
      }
    }
  }
  
  public final void ad(int paramInt, boolean paramBoolean)
  {
    for (;;)
    {
      int i;
      try
      {
        if ((this.gBc != null) && (paramInt >= 0) && (paramInt < this.gBc.size())) {
          break label119;
        }
        return;
      }
      finally {}
      if (i < this.gBc.size())
      {
        if (i == paramInt)
        {
          ((com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i)).qoH = true;
          ((com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i)).qoN = paramBoolean;
        }
        else
        {
          ((com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i)).qoH = false;
          ((com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i)).qoN = false;
        }
      }
      else
      {
        return;
        label119:
        i = 0;
        continue;
      }
      i += 1;
    }
  }
  
  public final void bZE()
  {
    if (this.gBc != null) {}
    for (int i = this.gBc.size();; i = 0)
    {
      x.i("MicroMsg.Note.NoteDataManager", "clear mDataList, size:%d", new Object[] { Integer.valueOf(i) });
      try
      {
        if (this.gBc != null) {
          this.gBc.clear();
        }
        this.qpV = 0;
        this.qpU = 0;
        return;
      }
      finally {}
    }
  }
  
  public final int bZF()
  {
    for (;;)
    {
      try
      {
        if (this.gBc != null)
        {
          i = 0;
          if (i < this.gBc.size())
          {
            if (!((com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i)).qoH) {
              break label53;
            }
            return i;
          }
        }
      }
      finally {}
      int i = -1;
      continue;
      label53:
      i += 1;
    }
  }
  
  public final void bZG()
  {
    try
    {
      if (this.gBc != null)
      {
        Iterator localIterator = this.gBc.iterator();
        while (localIterator.hasNext())
        {
          com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)localIterator.next();
          localb.qoH = false;
          localb.qoN = false;
        }
      }
    }
    finally {}
  }
  
  public final int bZI()
  {
    for (;;)
    {
      try
      {
        if (this.gBc != null)
        {
          i = 0;
          if (i < this.gBc.size())
          {
            if ((((com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i)).getType() != 4) || (!((k)this.gBc.get(i)).qoV.booleanValue())) {
              break label74;
            }
            return i;
          }
        }
      }
      finally {}
      int i = -1;
      continue;
      label74:
      i += 1;
    }
  }
  
  public final String bZJ()
  {
    for (;;)
    {
      try
      {
        if ((this.qpT != 0) || (this.gBc == null)) {
          break;
        }
        Iterator localIterator = this.gBc.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        n localn = (n)localIterator.next();
        if (localn.qpc.startsWith("WeNote_"))
        {
          i = bi.getInt(localn.qpc.substring(7), -1);
          if (i > this.qpT) {
            this.qpT = i;
          } else {
            i = this.qpT;
          }
        }
      }
      finally {}
    }
    Object localObject2 = new StringBuilder("WeNote_");
    int i = this.qpT + 1;
    this.qpT = i;
    localObject2 = i;
    return (String)localObject2;
  }
  
  public final String bZK()
  {
    String str = "";
    for (;;)
    {
      int i;
      com.tencent.mm.plugin.wenote.model.a.b localb;
      Object localObject3;
      try
      {
        if ((this.gBc != null) && (this.gBc.size() > 0)) {
          break label474;
        }
        return "";
      }
      finally {}
      if (i < this.gBc.size())
      {
        localb = (com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i);
        localObject3 = str;
      }
      switch (localb.getType())
      {
      case 1: 
        localObject3 = (h)localb;
        if (bi.oW(((h)localObject3).content))
        {
          str = str + "<br/>";
        }
        else
        {
          str = str + ((h)localObject3).content;
          localObject3 = str;
          if (i + 1 < this.gBc.size())
          {
            localObject3 = str;
            if (((com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i + 1)).getType() == 1)
            {
              localObject3 = str;
              if (!bi.oW(((h)this.gBc.get(i + 1)).content)) {
                str = str + "<br/>";
              }
            }
          }
        }
        break;
      case 2: 
        localObject3 = (com.tencent.mm.plugin.wenote.model.a.e)localb;
        str = str + cK(((com.tencent.mm.plugin.wenote.model.a.e)localObject3).qpc, 2);
        break;
      case 6: 
        localObject3 = (j)localb;
        str = str + cK(((j)localObject3).qpc, 6);
        break;
      case 4: 
        localObject3 = (k)localb;
        str = str + cK(((k)localObject3).qpc, 4);
        break;
      case 3: 
        localObject3 = (com.tencent.mm.plugin.wenote.model.a.f)localb;
        str = str + cK(((com.tencent.mm.plugin.wenote.model.a.f)localObject3).qpc, 3);
        break;
      case 5: 
        localObject3 = (com.tencent.mm.plugin.wenote.model.a.c)localb;
        str = str + cK(((com.tencent.mm.plugin.wenote.model.a.c)localObject3).qpc, 5);
        break;
      case -1: 
        str = str + "<hr/>";
        break label483;
        str = str.replaceAll("\n", "<br/>");
        return str;
        i = 0;
        break;
      default: 
        localObject3 = localObject1;
      case 0: 
        label474:
        Object localObject2 = localObject3;
        label483:
        i += 1;
      }
    }
  }
  
  public final ArrayList<com.tencent.mm.plugin.wenote.model.a.b> bZL()
  {
    if (this.gBc == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    try
    {
      Iterator localIterator = this.gBc.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(com.tencent.mm.plugin.wenote.b.c.c((com.tencent.mm.plugin.wenote.model.a.b)localIterator.next()));
      }
    }
    finally {}
    return localArrayList1;
  }
  
  public final void bZM()
  {
    au.Em().H(new c.3(this));
  }
  
  public final int bZN()
  {
    for (;;)
    {
      int i;
      try
      {
        if (this.gBc != null) {
          break label71;
        }
        return -1;
      }
      finally {}
      if (i < this.gBc.size())
      {
        com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i);
        if ((localb != null) && (localb.getType() != -3) && (localb.getType() != -2)) {
          return i;
        }
      }
      else
      {
        return -1;
        label71:
        i = 0;
        continue;
      }
      i += 1;
    }
  }
  
  public final int bZO()
  {
    for (;;)
    {
      int i;
      try
      {
        if (this.gBc == null) {
          return -1;
        }
        i = this.gBc.size() - 1;
        if (i >= 0)
        {
          com.tencent.mm.plugin.wenote.model.a.b localb = (com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(i);
          if ((localb != null) && (localb.getType() != -3) && (localb.getType() != -2)) {
            return i;
          }
        }
        else
        {
          return -1;
        }
      }
      finally {}
      i -= 1;
    }
  }
  
  public final boolean eq(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {}
    for (int i = 0;; i = 1)
    {
      if (paramInt2 < 0) {}
      for (int j = 0;; j = 1)
      {
        if ((i != 0) && (this.qpU + paramInt1 > 16384)) {}
        while ((j != 0) && (this.qpV + paramInt2 > 30)) {
          return true;
        }
        return false;
      }
    }
  }
  
  public final void er(int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.Note.NoteDataManager", "checkMergeTextDataItem startPos: %d endPos: %d needNotify: %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(true) });
    try
    {
      if (this.gBc != null) {
        break label459;
      }
      return;
    }
    finally {}
    if (paramInt2 >= this.gBc.size())
    {
      paramInt2 = this.gBc.size() - 1;
      paramInt1 = -1;
    }
    for (;;)
    {
      int j;
      int i;
      if (paramInt2 > j)
      {
        Object localObject1 = (com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(paramInt2);
        Object localObject3 = (com.tencent.mm.plugin.wenote.model.a.b)this.gBc.get(paramInt2 - 1);
        i = paramInt1;
        if (localObject1 != null)
        {
          i = paramInt1;
          if (((com.tencent.mm.plugin.wenote.model.a.b)localObject1).getType() == 1)
          {
            i = paramInt1;
            if (localObject3 != null)
            {
              i = paramInt1;
              if (((com.tencent.mm.plugin.wenote.model.a.b)localObject3).getType() == 1)
              {
                paramInt1 = paramInt2 - 1;
                localObject1 = (h)localObject1;
                localObject3 = (h)localObject3;
                Spanned localSpanned2;
                if (!bi.oW(((h)localObject1).content))
                {
                  Spanned localSpanned1 = com.tencent.mm.plugin.wenote.model.nativenote.a.a.Sk(((h)localObject1).content);
                  localSpanned2 = com.tencent.mm.plugin.wenote.model.nativenote.a.a.Sk(((h)localObject3).content);
                  ((h)localObject3).content = (((h)localObject3).content + "<br/>" + ((h)localObject1).content);
                  if (((h)localObject1).qoH)
                  {
                    ((h)localObject3).qoH = true;
                    ((h)localObject3).qoN = false;
                    if ((((h)localObject1).qoJ == -1) || (((h)localObject1).qoJ >= localSpanned1.length())) {
                      ((h)localObject3).qoJ = -1;
                    }
                  }
                }
                for (;;)
                {
                  x.i("MicroMsg.Note.NoteDataManager", "checkMergeTextDataItem remove position: %d", new Object[] { Integer.valueOf(paramInt2) });
                  Bw(paramInt2);
                  i = paramInt1;
                  if (this.qpR == null) {
                    break;
                  }
                  this.qpR.Bq(paramInt2);
                  i = paramInt1;
                  break;
                  i = localSpanned2.length();
                  ((h)localObject1).qoJ += i + 1;
                  continue;
                  if ((((h)localObject3).qoH) && (((h)localObject3).qoJ == -1))
                  {
                    ((h)localObject3).qoJ = localSpanned2.length();
                    continue;
                    if (((h)localObject2).qoH)
                    {
                      ((h)localObject3).qoH = true;
                      ((h)localObject3).qoN = false;
                      ((h)localObject3).qoJ = -1;
                    }
                  }
                }
              }
            }
          }
        }
      }
      else
      {
        if ((paramInt1 != -1) && (this.qpR != null)) {
          this.qpR.eo(paramInt1, this.gBc.size() - paramInt1);
        }
        bZM();
        return;
        paramInt1 = -1;
        continue;
        label459:
        j = paramInt1;
        if (paramInt1 > 0) {
          break;
        }
        j = 0;
        break;
      }
      paramInt2 -= 1;
      paramInt1 = i;
    }
  }
  
  public final int size()
  {
    if (this.gBc != null) {
      return this.gBc.size();
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/manager/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */