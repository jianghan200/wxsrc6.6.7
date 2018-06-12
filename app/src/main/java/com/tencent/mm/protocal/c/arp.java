package com.tencent.mm.protocal.c;

public final class arp
  extends com.tencent.mm.bk.a
{
  public String devicename;
  public String devicetype;
  public String fMk;
  public int rTQ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.fMk != null) {
        paramVarArgs.g(1, this.fMk);
      }
      if (this.devicename != null) {
        paramVarArgs.g(2, this.devicename);
      }
      if (this.devicetype != null) {
        paramVarArgs.g(3, this.devicetype);
      }
      paramVarArgs.fT(4, this.rTQ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.fMk == null) {
        break label324;
      }
    }
    label324:
    for (int i = f.a.a.b.b.a.h(1, this.fMk) + 0;; i = 0)
    {
      paramInt = i;
      if (this.devicename != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.devicename);
      }
      i = paramInt;
      if (this.devicetype != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.devicetype);
      }
      return i + f.a.a.a.fQ(4, this.rTQ);
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
        arp localarp = (arp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localarp.fMk = locala.vHC.readString();
          return 0;
        case 2: 
          localarp.devicename = locala.vHC.readString();
          return 0;
        case 3: 
          localarp.devicetype = locala.vHC.readString();
          return 0;
        }
        localarp.rTQ = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/arp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */