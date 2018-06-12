package com.tencent.mm.protocal.c;

public final class vv
  extends com.tencent.mm.bk.a
{
  public String appId;
  public String bGH;
  public int bPh;
  public String iconUrl;
  public String rzd;
  public int type;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.username != null) {
        paramVarArgs.g(1, this.username);
      }
      if (this.appId != null) {
        paramVarArgs.g(2, this.appId);
      }
      paramVarArgs.fT(3, this.bPh);
      if (this.iconUrl != null) {
        paramVarArgs.g(4, this.iconUrl);
      }
      paramVarArgs.fT(5, this.type);
      if (this.bGH != null) {
        paramVarArgs.g(6, this.bGH);
      }
      if (this.rzd != null) {
        paramVarArgs.g(7, this.rzd);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label481;
      }
    }
    label481:
    for (paramInt = f.a.a.b.b.a.h(1, this.username) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.appId != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.appId);
      }
      i += f.a.a.a.fQ(3, this.bPh);
      paramInt = i;
      if (this.iconUrl != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.iconUrl);
      }
      i = paramInt + f.a.a.a.fQ(5, this.type);
      paramInt = i;
      if (this.bGH != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.bGH);
      }
      i = paramInt;
      if (this.rzd != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rzd);
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
        vv localvv = (vv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localvv.username = locala.vHC.readString();
          return 0;
        case 2: 
          localvv.appId = locala.vHC.readString();
          return 0;
        case 3: 
          localvv.bPh = locala.vHC.rY();
          return 0;
        case 4: 
          localvv.iconUrl = locala.vHC.readString();
          return 0;
        case 5: 
          localvv.type = locala.vHC.rY();
          return 0;
        case 6: 
          localvv.bGH = locala.vHC.readString();
          return 0;
        }
        localvv.rzd = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/vv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */