package com.tencent.mm.protocal.c;

public final class wu
  extends com.tencent.mm.bk.a
{
  public String desc;
  public String info;
  public boolean rBD = false;
  public boolean rBE = false;
  public boolean rzh = false;
  public boolean rzi = false;
  public String thumbUrl;
  public String title;
  
  public final wu VF(String paramString)
  {
    this.title = paramString;
    this.rzh = true;
    return this;
  }
  
  public final wu VG(String paramString)
  {
    this.desc = paramString;
    this.rzi = true;
    return this;
  }
  
  public final wu VH(String paramString)
  {
    this.thumbUrl = paramString;
    this.rBD = true;
    return this;
  }
  
  public final wu VI(String paramString)
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
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label368;
      }
    }
    label368:
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
      return paramInt;
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
        wu localwu = (wu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localwu.title = locala.vHC.readString();
          localwu.rzh = true;
          return 0;
        case 2: 
          localwu.desc = locala.vHC.readString();
          localwu.rzi = true;
          return 0;
        case 3: 
          localwu.thumbUrl = locala.vHC.readString();
          localwu.rBD = true;
          return 0;
        }
        localwu.info = locala.vHC.readString();
        localwu.rBE = true;
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/wu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */