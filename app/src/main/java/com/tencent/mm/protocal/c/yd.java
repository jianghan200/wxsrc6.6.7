package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class yd
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public int create_time;
  public String jOS;
  public String jQb;
  public String jSv;
  public String lPl;
  public String rDG;
  public int rEb;
  public int rEc;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.jOS == null) {
        throw new b("Not all required fields were included: Desc");
      }
      if (this.lPl == null) {
        throw new b("Not all required fields were included: ThumbUrl");
      }
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.jOS != null) {
        paramVarArgs.g(2, this.jOS);
      }
      if (this.lPl != null) {
        paramVarArgs.g(3, this.lPl);
      }
      if (this.rDG != null) {
        paramVarArgs.g(4, this.rDG);
      }
      paramVarArgs.fT(5, this.rEb);
      paramVarArgs.fT(6, this.rEc);
      if (this.jQb != null) {
        paramVarArgs.g(7, this.jQb);
      }
      paramVarArgs.fT(8, this.create_time);
      if (this.jSv != null) {
        paramVarArgs.g(9, this.jSv);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label679;
      }
    }
    label679:
    for (int i = f.a.a.b.b.a.h(1, this.bHD) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jOS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jOS);
      }
      i = paramInt;
      if (this.lPl != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.lPl);
      }
      paramInt = i;
      if (this.rDG != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rDG);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rEb) + f.a.a.a.fQ(6, this.rEc);
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.jQb);
      }
      i = paramInt + f.a.a.a.fQ(8, this.create_time);
      paramInt = i;
      if (this.jSv != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.jSv);
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
        if (this.bHD == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.jOS == null) {
          throw new b("Not all required fields were included: Desc");
        }
        if (this.lPl != null) {
          break;
        }
        throw new b("Not all required fields were included: ThumbUrl");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        yd localyd = (yd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localyd.bHD = locala.vHC.readString();
          return 0;
        case 2: 
          localyd.jOS = locala.vHC.readString();
          return 0;
        case 3: 
          localyd.lPl = locala.vHC.readString();
          return 0;
        case 4: 
          localyd.rDG = locala.vHC.readString();
          return 0;
        case 5: 
          localyd.rEb = locala.vHC.rY();
          return 0;
        case 6: 
          localyd.rEc = locala.vHC.rY();
          return 0;
        case 7: 
          localyd.jQb = locala.vHC.readString();
          return 0;
        case 8: 
          localyd.create_time = locala.vHC.rY();
          return 0;
        }
        localyd.jSv = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/yd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */