package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class tj
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public int bzI;
  public String jOS;
  public String jPG;
  public String rem;
  public ti rwF;
  public String rwH;
  public String rwI;
  public int rwJ;
  public String rwK;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rwF == null) {
        throw new b("Not all required fields were included: BannerImg");
      }
      if (this.rwF != null)
      {
        paramVarArgs.fV(1, this.rwF.boi());
        this.rwF.a(paramVarArgs);
      }
      if (this.bHD != null) {
        paramVarArgs.g(2, this.bHD);
      }
      if (this.rwH != null) {
        paramVarArgs.g(3, this.rwH);
      }
      paramVarArgs.fT(4, this.bzI);
      if (this.rwI != null) {
        paramVarArgs.g(5, this.rwI);
      }
      paramVarArgs.fT(6, this.rwJ);
      if (this.jPG != null) {
        paramVarArgs.g(7, this.jPG);
      }
      if (this.jOS != null) {
        paramVarArgs.g(8, this.jOS);
      }
      if (this.rem != null) {
        paramVarArgs.g(9, this.rem);
      }
      if (this.rwK != null) {
        paramVarArgs.g(10, this.rwK);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rwF == null) {
        break label780;
      }
    }
    label780:
    for (int i = f.a.a.a.fS(1, this.rwF.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bHD);
      }
      i = paramInt;
      if (this.rwH != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rwH);
      }
      i += f.a.a.a.fQ(4, this.bzI);
      paramInt = i;
      if (this.rwI != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rwI);
      }
      i = paramInt + f.a.a.a.fQ(6, this.rwJ);
      paramInt = i;
      if (this.jPG != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.jPG);
      }
      i = paramInt;
      if (this.jOS != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.jOS);
      }
      paramInt = i;
      if (this.rem != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rem);
      }
      i = paramInt;
      if (this.rwK != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.rwK);
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
        if (this.rwF != null) {
          break;
        }
        throw new b("Not all required fields were included: BannerImg");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        tj localtj = (tj)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ti();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ti)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localtj.rwF = ((ti)localObject1);
            paramInt += 1;
          }
        case 2: 
          localtj.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localtj.rwH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localtj.bzI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localtj.rwI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localtj.rwJ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localtj.jPG = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localtj.jOS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localtj.rem = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localtj.rwK = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/tj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */