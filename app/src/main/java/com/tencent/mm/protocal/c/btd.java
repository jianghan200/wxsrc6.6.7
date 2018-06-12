package com.tencent.mm.protocal.c;

public final class btd
  extends com.tencent.mm.bk.a
{
  public String hFk;
  public String rFf;
  public String sign;
  public String sqy;
  public int sqz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sqy != null) {
        paramVarArgs.g(4, this.sqy);
      }
      if (this.sign != null) {
        paramVarArgs.g(5, this.sign);
      }
      if (this.hFk != null) {
        paramVarArgs.g(6, this.hFk);
      }
      paramVarArgs.fT(7, this.sqz);
      if (this.rFf != null) {
        paramVarArgs.g(8, this.rFf);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.sqy == null) {
        break label387;
      }
    }
    label387:
    for (int i = f.a.a.b.b.a.h(4, this.sqy) + 0;; i = 0)
    {
      paramInt = i;
      if (this.sign != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.sign);
      }
      i = paramInt;
      if (this.hFk != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.hFk);
      }
      i += f.a.a.a.fQ(7, this.sqz);
      paramInt = i;
      if (this.rFf != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rFf);
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
        btd localbtd = (btd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 4: 
          localbtd.sqy = locala.vHC.readString();
          return 0;
        case 5: 
          localbtd.sign = locala.vHC.readString();
          return 0;
        case 6: 
          localbtd.hFk = locala.vHC.readString();
          return 0;
        case 7: 
          localbtd.sqz = locala.vHC.rY();
          return 0;
        }
        localbtd.rFf = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/btd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */