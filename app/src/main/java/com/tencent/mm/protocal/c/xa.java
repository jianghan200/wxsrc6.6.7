package com.tencent.mm.protocal.c;

public final class xa
  extends com.tencent.mm.bk.a
{
  public String canvasPageXml;
  public String desc;
  public int dwt;
  public boolean rAt = false;
  public boolean rBD = false;
  public String rCn;
  public boolean rCo = false;
  public int rCp;
  public boolean rCq = false;
  public boolean rCr = false;
  public boolean rzh = false;
  public boolean rzi = false;
  public String thumbUrl;
  public String title;
  
  public final xa CP(int paramInt)
  {
    this.rCp = paramInt;
    this.rCq = true;
    return this;
  }
  
  public final xa CQ(int paramInt)
  {
    this.dwt = paramInt;
    this.rCr = true;
    return this;
  }
  
  public final xa VJ(String paramString)
  {
    this.title = paramString;
    this.rzh = true;
    return this;
  }
  
  public final xa VK(String paramString)
  {
    this.desc = paramString;
    this.rzi = true;
    return this;
  }
  
  public final xa VL(String paramString)
  {
    this.rCn = paramString;
    this.rCo = true;
    return this;
  }
  
  public final xa VM(String paramString)
  {
    this.thumbUrl = paramString;
    this.rBD = true;
    return this;
  }
  
  public final xa VN(String paramString)
  {
    this.canvasPageXml = paramString;
    this.rAt = true;
    return this;
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.g(1, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.g(2, this.desc);
      }
      if (this.rCn != null) {
        paramVarArgs.g(3, this.rCn);
      }
      if (this.thumbUrl != null) {
        paramVarArgs.g(4, this.thumbUrl);
      }
      if (this.rCq == true) {
        paramVarArgs.fT(5, this.rCp);
      }
      if (this.rCr == true) {
        paramVarArgs.fT(6, this.dwt);
      }
      if (this.canvasPageXml != null) {
        paramVarArgs.g(7, this.canvasPageXml);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label559;
      }
    }
    label559:
    for (int i = f.a.a.b.b.a.h(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.desc);
      }
      i = paramInt;
      if (this.rCn != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rCn);
      }
      paramInt = i;
      if (this.thumbUrl != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.thumbUrl);
      }
      i = paramInt;
      if (this.rCq == true) {
        i = paramInt + f.a.a.a.fQ(5, this.rCp);
      }
      paramInt = i;
      if (this.rCr == true) {
        paramInt = i + f.a.a.a.fQ(6, this.dwt);
      }
      i = paramInt;
      if (this.canvasPageXml != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.canvasPageXml);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        xa localxa = (xa)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localxa.title = locala.vHC.readString();
          localxa.rzh = true;
          return 0;
        case 2: 
          localxa.desc = locala.vHC.readString();
          localxa.rzi = true;
          return 0;
        case 3: 
          localxa.rCn = locala.vHC.readString();
          localxa.rCo = true;
          return 0;
        case 4: 
          localxa.thumbUrl = locala.vHC.readString();
          localxa.rBD = true;
          return 0;
        case 5: 
          localxa.rCp = locala.vHC.rY();
          localxa.rCq = true;
          return 0;
        case 6: 
          localxa.dwt = locala.vHC.rY();
          localxa.rCr = true;
          return 0;
        }
        localxa.canvasPageXml = locala.vHC.readString();
        localxa.rAt = true;
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/xa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */