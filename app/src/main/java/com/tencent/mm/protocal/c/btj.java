package com.tencent.mm.protocal.c;

public final class btj
  extends com.tencent.mm.bk.a
{
  public String mediaId;
  public long srb;
  public long srf;
  public long srg;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.mediaId != null) {
        paramVarArgs.g(1, this.mediaId);
      }
      paramVarArgs.T(2, this.srf);
      paramVarArgs.T(3, this.srg);
      paramVarArgs.T(4, this.srb);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mediaId == null) {
        break label284;
      }
    }
    label284:
    for (paramInt = f.a.a.b.b.a.h(1, this.mediaId) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.S(2, this.srf) + f.a.a.a.S(3, this.srg) + f.a.a.a.S(4, this.srb);
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
        btj localbtj = (btj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbtj.mediaId = locala.vHC.readString();
          return 0;
        case 2: 
          localbtj.srf = locala.vHC.rZ();
          return 0;
        case 3: 
          localbtj.srg = locala.vHC.rZ();
          return 0;
        }
        localbtj.srb = locala.vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/btj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */