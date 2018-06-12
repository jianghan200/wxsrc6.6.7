package com.tencent.mm.protocal.c;

public final class cet
  extends com.tencent.mm.bk.a
{
  public com.tencent.mm.bk.b rdU;
  public int szE;
  public long szl;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rdU == null) {
        throw new f.a.a.b("Not all required fields were included: VoiceData");
      }
      paramVarArgs.T(1, this.szl);
      if (this.rdU != null) {
        paramVarArgs.b(2, this.rdU);
      }
      paramVarArgs.fT(3, this.szE);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.S(1, this.szl) + 0;
      paramInt = i;
      if (this.rdU != null) {
        paramInt = i + f.a.a.a.a(2, this.rdU);
      }
      return paramInt + f.a.a.a.fQ(3, this.szE);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rdU == null) {
        throw new f.a.a.b("Not all required fields were included: VoiceData");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      cet localcet = (cet)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcet.szl = locala.vHC.rZ();
        return 0;
      case 2: 
        localcet.rdU = locala.cJR();
        return 0;
      }
      localcet.szE = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/cet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */