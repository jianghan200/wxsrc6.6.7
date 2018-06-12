package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class ja
  extends bhd
{
  public String myl;
  public String rcD;
  public String rcE;
  public String rcF;
  public int rcI;
  public b rkr;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rcD != null) {
        paramVarArgs.g(2, this.rcD);
      }
      if (this.rcE != null) {
        paramVarArgs.g(3, this.rcE);
      }
      if (this.myl != null) {
        paramVarArgs.g(4, this.myl);
      }
      paramVarArgs.fT(5, this.rcI);
      if (this.rkr != null) {
        paramVarArgs.b(6, this.rkr);
      }
      if (this.rcF != null) {
        paramVarArgs.g(7, this.rcF);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label588;
      }
    }
    label588:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rcD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rcD);
      }
      i = paramInt;
      if (this.rcE != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rcE);
      }
      paramInt = i;
      if (this.myl != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.myl);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rcI);
      paramInt = i;
      if (this.rkr != null) {
        paramInt = i + f.a.a.a.a(6, this.rkr);
      }
      i = paramInt;
      if (this.rcF != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rcF);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ja localja = (ja)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localja.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localja.rcD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localja.rcE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localja.myl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localja.rcI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localja.rkr = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        }
        localja.rcF = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/ja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */