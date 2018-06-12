package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class aon
  extends bhd
{
  public String bJT;
  public String bPS;
  public String rQC;
  public String rQE;
  public String rQF;
  public b rQG;
  public String signature;
  public String url;
  
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
      if (this.url != null) {
        paramVarArgs.g(2, this.url);
      }
      if (this.bPS != null) {
        paramVarArgs.g(3, this.bPS);
      }
      if (this.rQC != null) {
        paramVarArgs.g(4, this.rQC);
      }
      if (this.bJT != null) {
        paramVarArgs.g(5, this.bJT);
      }
      if (this.rQE != null) {
        paramVarArgs.g(6, this.rQE);
      }
      if (this.signature != null) {
        paramVarArgs.g(7, this.signature);
      }
      if (this.rQF != null) {
        paramVarArgs.g(8, this.rQF);
      }
      if (this.rQG != null) {
        paramVarArgs.b(9, this.rQG);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label718;
      }
    }
    label718:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.url);
      }
      i = paramInt;
      if (this.bPS != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bPS);
      }
      paramInt = i;
      if (this.rQC != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rQC);
      }
      i = paramInt;
      if (this.bJT != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.bJT);
      }
      paramInt = i;
      if (this.rQE != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rQE);
      }
      i = paramInt;
      if (this.signature != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.signature);
      }
      paramInt = i;
      if (this.rQF != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rQF);
      }
      i = paramInt;
      if (this.rQG != null) {
        i = paramInt + f.a.a.a.a(9, this.rQG);
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
        aon localaon = (aon)paramVarArgs[1];
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
            localaon.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaon.url = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaon.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaon.rQC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaon.bJT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaon.rQE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localaon.signature = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localaon.rQF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localaon.rQG = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/aon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */