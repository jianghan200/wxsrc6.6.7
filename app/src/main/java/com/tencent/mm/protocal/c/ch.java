package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ch
  extends com.tencent.mm.bk.a
{
  public int bVU;
  public int mwQ;
  public String myl;
  public String rcD;
  public String rcE;
  public String rcF;
  public xb rcG;
  public String rcH;
  public int rcI;
  public int scene;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rcD == null) {
        throw new b("Not all required fields were included: f2f_id");
      }
      if (this.rcF == null) {
        throw new b("Not all required fields were included: payok_checksign");
      }
      if (this.rcD != null) {
        paramVarArgs.g(1, this.rcD);
      }
      if (this.rcE != null) {
        paramVarArgs.g(2, this.rcE);
      }
      paramVarArgs.fT(3, this.bVU);
      paramVarArgs.fT(4, this.mwQ);
      paramVarArgs.fT(5, this.scene);
      if (this.rcF != null) {
        paramVarArgs.g(6, this.rcF);
      }
      if (this.rcG != null)
      {
        paramVarArgs.fV(7, this.rcG.boi());
        this.rcG.a(paramVarArgs);
      }
      if (this.rcH != null) {
        paramVarArgs.g(8, this.rcH);
      }
      if (this.myl != null) {
        paramVarArgs.g(9, this.myl);
      }
      paramVarArgs.fT(10, this.rcI);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rcD == null) {
        break label776;
      }
    }
    label776:
    for (paramInt = f.a.a.b.b.a.h(1, this.rcD) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rcE != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rcE);
      }
      i = i + f.a.a.a.fQ(3, this.bVU) + f.a.a.a.fQ(4, this.mwQ) + f.a.a.a.fQ(5, this.scene);
      paramInt = i;
      if (this.rcF != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rcF);
      }
      i = paramInt;
      if (this.rcG != null) {
        i = paramInt + f.a.a.a.fS(7, this.rcG.boi());
      }
      paramInt = i;
      if (this.rcH != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rcH);
      }
      i = paramInt;
      if (this.myl != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.myl);
      }
      return i + f.a.a.a.fQ(10, this.rcI);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rcD == null) {
          throw new b("Not all required fields were included: f2f_id");
        }
        if (this.rcF != null) {
          break;
        }
        throw new b("Not all required fields were included: payok_checksign");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ch localch = (ch)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localch.rcD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localch.rcE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localch.bVU = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localch.mwQ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localch.scene = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localch.rcF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new xb();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((xb)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localch.rcG = ((xb)localObject1);
            paramInt += 1;
          }
        case 8: 
          localch.rcH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localch.myl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localch.rcI = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */