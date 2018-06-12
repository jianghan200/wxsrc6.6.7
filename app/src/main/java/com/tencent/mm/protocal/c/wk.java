package com.tencent.mm.protocal.c;

public final class wk
  extends com.tencent.mm.bk.a
{
  public String desc;
  public String info;
  public boolean rBD = false;
  public boolean rBE = false;
  public boolean rBF = false;
  public boolean rzh = false;
  public boolean rzi = false;
  public String thumbUrl;
  public String title;
  public int type;
  
  public final wk CL(int paramInt)
  {
    this.type = paramInt;
    this.rBF = true;
    return this;
  }
  
  public final wk Vp(String paramString)
  {
    this.title = paramString;
    this.rzh = true;
    return this;
  }
  
  public final wk Vq(String paramString)
  {
    this.desc = paramString;
    this.rzi = true;
    return this;
  }
  
  public final wk Vr(String paramString)
  {
    this.thumbUrl = paramString;
    this.rBD = true;
    return this;
  }
  
  public final wk Vs(String paramString)
  {
    this.info = paramString;
    this.rBE = true;
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
      if (this.thumbUrl != null) {
        paramVarArgs.g(3, this.thumbUrl);
      }
      if (this.info != null) {
        paramVarArgs.g(4, this.info);
      }
      if (this.rBF == true) {
        paramVarArgs.fT(5, this.type);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label429;
      }
    }
    label429:
    for (int i = f.a.a.b.b.a.h(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.desc);
      }
      i = paramInt;
      if (this.thumbUrl != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.thumbUrl);
      }
      paramInt = i;
      if (this.info != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.info);
      }
      i = paramInt;
      if (this.rBF == true) {
        i = paramInt + f.a.a.a.fQ(5, this.type);
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
        wk localwk = (wk)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localwk.title = locala.vHC.readString();
          localwk.rzh = true;
          return 0;
        case 2: 
          localwk.desc = locala.vHC.readString();
          localwk.rzi = true;
          return 0;
        case 3: 
          localwk.thumbUrl = locala.vHC.readString();
          localwk.rBD = true;
          return 0;
        case 4: 
          localwk.info = locala.vHC.readString();
          localwk.rBE = true;
          return 0;
        }
        localwk.type = locala.vHC.rY();
        localwk.rBF = true;
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/wk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */