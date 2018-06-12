package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class axo
  extends bhd
{
  public int bVB;
  public String lMV;
  public String pjw;
  public String rhb;
  public String rhc;
  public boolean saG;
  public String saH;
  public String saI;
  public int saJ;
  
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
      if (this.rhb != null) {
        paramVarArgs.g(2, this.rhb);
      }
      if (this.rhc != null) {
        paramVarArgs.g(3, this.rhc);
      }
      if (this.saH != null) {
        paramVarArgs.g(4, this.saH);
      }
      if (this.saI != null) {
        paramVarArgs.g(5, this.saI);
      }
      if (this.pjw != null) {
        paramVarArgs.g(6, this.pjw);
      }
      if (this.lMV != null) {
        paramVarArgs.g(7, this.lMV);
      }
      paramVarArgs.fT(8, this.bVB);
      paramVarArgs.fT(9, this.saJ);
      paramVarArgs.av(10, this.saG);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label717;
      }
    }
    label717:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rhb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rhb);
      }
      i = paramInt;
      if (this.rhc != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rhc);
      }
      paramInt = i;
      if (this.saH != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.saH);
      }
      i = paramInt;
      if (this.saI != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.saI);
      }
      paramInt = i;
      if (this.pjw != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.pjw);
      }
      i = paramInt;
      if (this.lMV != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.lMV);
      }
      return i + f.a.a.a.fQ(8, this.bVB) + f.a.a.a.fQ(9, this.saJ) + (f.a.a.b.b.a.ec(10) + 1);
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
        axo localaxo = (axo)paramVarArgs[1];
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
            localaxo.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaxo.rhb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaxo.rhc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaxo.saH = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaxo.saI = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaxo.pjw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localaxo.lMV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localaxo.bVB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localaxo.saJ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localaxo.saG = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/axo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */